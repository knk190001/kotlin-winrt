package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(IShareCompletedEventArgs.ABI::class)
@Signature("{4574c442-f913-4f60-9df7-cc4060ab1916}")
@Guid("4574c442f9134f609df7cc4060ab1916")
@WinRTInterface("4574c442f9134f609df7cc4060ab1916")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareCompletedEventArgs.ByReference::class)
public interface IShareCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShareTarget(): ShareTargetInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareCompletedEventArgs> {
    public override fun getValue() = ABI.makeIShareCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IShareCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareCompletedEventArgs {
    public val __1540812095_Ptr: Pointer?

    public val _1540812095_VtblPtr: Pointer?
      get() = __1540812095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShareTarget(): ShareTargetInfo? {
      val fnPtr = _1540812095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ShareTargetInfo>()
      val hr = fn.invokeHR(arrayOf(__1540812095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ShareTargetInfo>(result.getValue())
      return resultValue
    }
  }

  public class IShareCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1540812095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4574c442f9134f609df7cc4060ab1916")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareCompletedEventArgs(ptr: Pointer?): WithDefault =
        IShareCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIShareCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IShareCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1540812095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareCompletedEventArgs):
        Array<IShareCompletedEventArgs?> = (elements as
        Array<IShareCompletedEventArgs?>).castToImpl<IShareCompletedEventArgs,IShareCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareCompletedEventArgs?> =
        arrayOfNulls<IShareCompletedEventArgs_Impl>(size) as Array<IShareCompletedEventArgs?>
  }
}
