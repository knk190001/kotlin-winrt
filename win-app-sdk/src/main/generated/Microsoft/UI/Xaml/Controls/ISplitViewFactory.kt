package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ISplitViewFactory.ABI::class)
@Signature("{389ece72-75ce-561b-aad3-c52125ca6a50}")
@Guid("389ece7275ce561baad3c52125ca6a50")
@WinRTInterface("389ece7275ce561baad3c52125ca6a50")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitViewFactory.ByReference::class)
public interface ISplitViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): SplitView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitViewFactory> {
    public override fun getValue() = ABI.makeISplitViewFactory(pointer.getPointer(0))

    public fun setValue(value: ISplitViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitViewFactory {
    public val __1003547918_Ptr: Pointer?

    public val _1003547918_VtblPtr: Pointer?
      get() = __1003547918_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        SplitView? {
      val fnPtr = _1003547918_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SplitView>()
      val hr = fn.invokeHR(arrayOf(__1003547918_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SplitView>(result.getValue())
      return resultValue
    }
  }

  public class ISplitViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1003547918_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("389ece7275ce561baad3c52125ca6a50")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitViewFactory(ptr: Pointer?): WithDefault = ISplitViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitViewFactory {
      val address = segment.toRawLongValue()
      return makeISplitViewFactory(Pointer(address))
    }

    public override fun toNative(obj: ISplitViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1003547918_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitViewFactory): Array<ISplitViewFactory?> = (elements
        as Array<ISplitViewFactory?>).castToImpl<ISplitViewFactory,ISplitViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitViewFactory?> =
        arrayOfNulls<ISplitViewFactory_Impl>(size) as Array<ISplitViewFactory?>
  }
}
