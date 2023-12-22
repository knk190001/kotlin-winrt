package Windows.UI.Input.Inking

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

@ABIMarker(IInkInputProcessingConfiguration.ABI::class)
@Signature("{2778d85e-33ca-4b06-a6d3-ac3945116d37}")
@Guid("2778d85e33ca4b06a6d3ac3945116d37")
@WinRTInterface("2778d85e33ca4b06a6d3ac3945116d37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkInputProcessingConfiguration.ByReference::class)
public interface IInkInputProcessingConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): InkInputProcessingMode?

  @InterfaceMethod(1)
  public fun put_Mode(value: InkInputProcessingMode?): Unit

  @InterfaceMethod(2)
  public fun get_RightDragAction(): InkInputRightDragAction?

  @InterfaceMethod(3)
  public fun put_RightDragAction(value: InkInputRightDragAction?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkInputProcessingConfiguration> {
    public override fun getValue() = ABI.makeIInkInputProcessingConfiguration(pointer.getPointer(0))

    public fun setValue(value: IInkInputProcessingConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkInputProcessingConfiguration {
    public val __1696365477_Ptr: Pointer?

    public val _1696365477_VtblPtr: Pointer?
      get() = __1696365477_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): InkInputProcessingMode? {
      val fnPtr = _1696365477_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkInputProcessingMode>()
      val hr = fn.invokeHR(arrayOf(__1696365477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkInputProcessingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mode(value: InkInputProcessingMode?): Unit {
      val fnPtr = _1696365477_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1696365477_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RightDragAction(): InkInputRightDragAction? {
      val fnPtr = _1696365477_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkInputRightDragAction>()
      val hr = fn.invokeHR(arrayOf(__1696365477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkInputRightDragAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RightDragAction(value: InkInputRightDragAction?): Unit {
      val fnPtr = _1696365477_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1696365477_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkInputProcessingConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1696365477_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkInputProcessingConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2778d85e33ca4b06a6d3ac3945116d37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkInputProcessingConfiguration(ptr: Pointer?): WithDefault =
        IInkInputProcessingConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkInputProcessingConfiguration {
      val address = segment.toRawLongValue()
      return makeIInkInputProcessingConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IInkInputProcessingConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1696365477_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkInputProcessingConfiguration):
        Array<IInkInputProcessingConfiguration?> = (elements as
        Array<IInkInputProcessingConfiguration?>).castToImpl<IInkInputProcessingConfiguration,IInkInputProcessingConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkInputProcessingConfiguration?> =
        arrayOfNulls<IInkInputProcessingConfiguration_Impl>(size) as
        Array<IInkInputProcessingConfiguration?>
  }
}
