package Windows.UI.Xaml.Data

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

@ABIMarker(IBinding2.ABI::class)
@Signature("{34f96fcb-0406-48b3-9e82-f333ec4c6910}")
@Guid("34f96fcb040648b39e82f333ec4c6910")
@WinRTInterface("34f96fcb040648b39e82f333ec4c6910")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBinding2.ByReference::class)
public interface IBinding2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FallbackValue(): IUnknown?

  @InterfaceMethod(1)
  public fun put_FallbackValue(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_TargetNullValue(): IUnknown?

  @InterfaceMethod(3)
  public fun put_TargetNullValue(value: IUnknown?): Unit

  @InterfaceMethod(4)
  public fun get_UpdateSourceTrigger(): UpdateSourceTrigger?

  @InterfaceMethod(5)
  public fun put_UpdateSourceTrigger(value: UpdateSourceTrigger?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBinding2> {
    public override fun getValue() = ABI.makeIBinding2(pointer.getPointer(0))

    public fun setValue(value: IBinding2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBinding2 {
    public val __869889931_Ptr: Pointer?

    public val _869889931_VtblPtr: Pointer?
      get() = __869889931_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FallbackValue(): IUnknown? {
      val fnPtr = _869889931_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__869889931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FallbackValue(value: IUnknown?): Unit {
      val fnPtr = _869889931_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__869889931_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TargetNullValue(): IUnknown? {
      val fnPtr = _869889931_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__869889931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TargetNullValue(value: IUnknown?): Unit {
      val fnPtr = _869889931_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__869889931_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_UpdateSourceTrigger(): UpdateSourceTrigger? {
      val fnPtr = _869889931_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UpdateSourceTrigger>()
      val hr = fn.invokeHR(arrayOf(__869889931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UpdateSourceTrigger>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_UpdateSourceTrigger(value: UpdateSourceTrigger?): Unit {
      val fnPtr = _869889931_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__869889931_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBinding2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __869889931_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBinding2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34f96fcb040648b39e82f333ec4c6910")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBinding2(ptr: Pointer?): WithDefault = IBinding2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBinding2 {
      val address = segment.toRawLongValue()
      return makeIBinding2(Pointer(address))
    }

    public override fun toNative(obj: IBinding2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__869889931_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBinding2): Array<IBinding2?> = (elements as
        Array<IBinding2?>).castToImpl<IBinding2,IBinding2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBinding2?> = arrayOfNulls<IBinding2_Impl>(size)
        as Array<IBinding2?>
  }
}
