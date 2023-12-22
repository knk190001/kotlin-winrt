package Windows.Graphics.Holographic

import Windows.Graphics.Holographic.IHolographicCamera.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IHolographicCamera2.ABI::class)
@Signature("{b55b9f1a-ba8c-4f84-ad79-2e7e1e2450f3}")
@Guid("b55b9f1aba8c4f84ad792e7e1e2450f3")
@WinRTInterface("b55b9f1aba8c4f84ad792e7e1e2450f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCamera2.ByReference::class)
public interface IHolographicCamera2 : NativeMapped, IWinRTInterface, IHolographicCamera {
  @InterfaceMethod(0)
  public fun get_LeftViewportParameters(): HolographicCameraViewportParameters?

  @InterfaceMethod(1)
  public fun get_RightViewportParameters(): HolographicCameraViewportParameters?

  @InterfaceMethod(2)
  public fun get_Display(): HolographicDisplay?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCamera2> {
    public override fun getValue() = ABI.makeIHolographicCamera2(pointer.getPointer(0))

    public fun setValue(value: IHolographicCamera2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCamera2, IHolographicCamera.WithDefault {
    public val __2125569870_Ptr: Pointer?

    public val _2125569870_VtblPtr: Pointer?
      get() = __2125569870_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LeftViewportParameters(): HolographicCameraViewportParameters? {
      val fnPtr = _2125569870_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicCameraViewportParameters>()
      val hr = fn.invokeHR(arrayOf(__2125569870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicCameraViewportParameters>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RightViewportParameters(): HolographicCameraViewportParameters? {
      val fnPtr = _2125569870_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicCameraViewportParameters>()
      val hr = fn.invokeHR(arrayOf(__2125569870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicCameraViewportParameters>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Display(): HolographicDisplay? {
      val fnPtr = _2125569870_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicDisplay>()
      val hr = fn.invokeHR(arrayOf(__2125569870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicDisplay>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicCamera2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IHolographicCamera {
    public override val __484208768_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2125569870_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2125569870_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCamera2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b55b9f1aba8c4f84ad792e7e1e2450f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCamera2(ptr: Pointer?): WithDefault = IHolographicCamera2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCamera2 {
      val address = segment.toRawLongValue()
      return makeIHolographicCamera2(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCamera2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2125569870_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCamera2): Array<IHolographicCamera2?> =
        (elements as
        Array<IHolographicCamera2?>).castToImpl<IHolographicCamera2,IHolographicCamera2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCamera2?> =
        arrayOfNulls<IHolographicCamera2_Impl>(size) as Array<IHolographicCamera2?>
  }
}
