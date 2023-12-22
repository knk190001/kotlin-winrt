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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkInputConfiguration.ABI::class)
@Signature("{93a68dc4-0b7b-49d7-b34f-9901e524dcf2}")
@Guid("93a68dc40b7b49d7b34f9901e524dcf2")
@WinRTInterface("93a68dc40b7b49d7b34f9901e524dcf2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkInputConfiguration.ByReference::class)
public interface IInkInputConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPrimaryBarrelButtonInputEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsPrimaryBarrelButtonInputEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsEraserInputEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsEraserInputEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkInputConfiguration> {
    public override fun getValue() = ABI.makeIInkInputConfiguration(pointer.getPointer(0))

    public fun setValue(value: IInkInputConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkInputConfiguration {
    public val __39215496_Ptr: Pointer?

    public val _39215496_VtblPtr: Pointer?
      get() = __39215496_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPrimaryBarrelButtonInputEnabled(): Boolean {
      val fnPtr = _39215496_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__39215496_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsPrimaryBarrelButtonInputEnabled(value: Boolean): Unit {
      val fnPtr = _39215496_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__39215496_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsEraserInputEnabled(): Boolean {
      val fnPtr = _39215496_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__39215496_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsEraserInputEnabled(value: Boolean): Unit {
      val fnPtr = _39215496_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__39215496_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkInputConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __39215496_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkInputConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93a68dc40b7b49d7b34f9901e524dcf2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkInputConfiguration(ptr: Pointer?): WithDefault =
        IInkInputConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkInputConfiguration {
      val address = segment.toRawLongValue()
      return makeIInkInputConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IInkInputConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__39215496_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkInputConfiguration): Array<IInkInputConfiguration?> =
        (elements as
        Array<IInkInputConfiguration?>).castToImpl<IInkInputConfiguration,IInkInputConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkInputConfiguration?> =
        arrayOfNulls<IInkInputConfiguration_Impl>(size) as Array<IInkInputConfiguration?>
  }
}
