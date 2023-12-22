package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISectionsInViewChangedEventArgs.ABI::class)
@Signature("{dd49ee6b-d165-430f-a37d-b807064f85e1}")
@Guid("dd49ee6bd165430fa37db807064f85e1")
@WinRTInterface("dd49ee6bd165430fa37db807064f85e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISectionsInViewChangedEventArgs.ByReference::class)
public interface ISectionsInViewChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AddedSections(): IVector<HubSection?>?

  @InterfaceMethod(1)
  public fun get_RemovedSections(): IVector<HubSection?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISectionsInViewChangedEventArgs> {
    public override fun getValue() = ABI.makeISectionsInViewChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISectionsInViewChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISectionsInViewChangedEventArgs {
    public val __334591305_Ptr: Pointer?

    public val _334591305_VtblPtr: Pointer?
      get() = __334591305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AddedSections(): IVector<HubSection?>? {
      val fnPtr = _334591305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HubSection?>>()
      val hr = fn.invokeHR(arrayOf(__334591305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HubSection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RemovedSections(): IVector<HubSection?>? {
      val fnPtr = _334591305_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HubSection?>>()
      val hr = fn.invokeHR(arrayOf(__334591305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HubSection?>>(result.getValue())
      return resultValue
    }
  }

  public class ISectionsInViewChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __334591305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISectionsInViewChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd49ee6bd165430fa37db807064f85e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISectionsInViewChangedEventArgs(ptr: Pointer?): WithDefault =
        ISectionsInViewChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISectionsInViewChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISectionsInViewChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISectionsInViewChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__334591305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISectionsInViewChangedEventArgs):
        Array<ISectionsInViewChangedEventArgs?> = (elements as
        Array<ISectionsInViewChangedEventArgs?>).castToImpl<ISectionsInViewChangedEventArgs,ISectionsInViewChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISectionsInViewChangedEventArgs?> =
        arrayOfNulls<ISectionsInViewChangedEventArgs_Impl>(size) as
        Array<ISectionsInViewChangedEventArgs?>
  }
}
