package Microsoft.UI.Xaml.Automation.Provider

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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITransformProvider.ABI::class)
@Signature("{6fd76988-8f52-5ef2-a826-9c8c4951c911}")
@Guid("6fd769888f525ef2a8269c8c4951c911")
@WinRTInterface("6fd769888f525ef2a8269c8c4951c911")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransformProvider.ByReference::class)
public interface ITransformProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanMove(): Boolean

  @InterfaceMethod(1)
  public fun get_CanResize(): Boolean

  @InterfaceMethod(2)
  public fun get_CanRotate(): Boolean

  @InterfaceMethod(3)
  public fun Move(x: Double, y: Double): Unit

  @InterfaceMethod(4)
  public fun Resize(width: Double, height: Double): Unit

  @InterfaceMethod(5)
  public fun Rotate(degrees: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITransformProvider> {
    public override fun getValue() = ABI.makeITransformProvider(pointer.getPointer(0))

    public fun setValue(value: ITransformProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransformProvider {
    public val __372340368_Ptr: Pointer?

    public val _372340368_VtblPtr: Pointer?
      get() = __372340368_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanMove(): Boolean {
      val fnPtr = _372340368_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__372340368_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CanResize(): Boolean {
      val fnPtr = _372340368_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__372340368_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CanRotate(): Boolean {
      val fnPtr = _372340368_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__372340368_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun Move(x: Double, y: Double): Unit {
      val fnPtr = _372340368_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__372340368_Ptr, x, y,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Resize(width: Double, height: Double): Unit {
      val fnPtr = _372340368_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__372340368_Ptr, width, height,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Rotate(degrees: Double): Unit {
      val fnPtr = _372340368_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__372340368_Ptr, degrees,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITransformProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __372340368_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransformProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6fd769888f525ef2a8269c8c4951c911")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransformProvider(ptr: Pointer?): WithDefault = ITransformProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransformProvider {
      val address = segment.toRawLongValue()
      return makeITransformProvider(Pointer(address))
    }

    public override fun toNative(obj: ITransformProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__372340368_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransformProvider): Array<ITransformProvider?> =
        (elements as
        Array<ITransformProvider?>).castToImpl<ITransformProvider,ITransformProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransformProvider?> =
        arrayOfNulls<ITransformProvider_Impl>(size) as Array<ITransformProvider?>
  }
}
