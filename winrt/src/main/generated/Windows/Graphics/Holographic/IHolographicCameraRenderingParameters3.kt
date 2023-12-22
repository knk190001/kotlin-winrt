package Windows.Graphics.Holographic

import Windows.Graphics.Holographic.IHolographicCameraRenderingParameters2.ABI.IID
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHolographicCameraRenderingParameters3.ABI::class)
@Signature("{b1aa513f-136d-4b06-b9d4-e4b914cd0683}")
@Guid("b1aa513f136d4b06b9d4e4b914cd0683")
@WinRTInterface("b1aa513f136d4b06b9d4e4b914cd0683")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCameraRenderingParameters3.ByReference::class)
public interface IHolographicCameraRenderingParameters3 : NativeMapped, IWinRTInterface,
    IHolographicCameraRenderingParameters2, IHolographicCameraRenderingParameters {
  @InterfaceMethod(0)
  public fun get_IsContentProtectionEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsContentProtectionEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCameraRenderingParameters3> {
    public override fun getValue() =
        ABI.makeIHolographicCameraRenderingParameters3(pointer.getPointer(0))

    public fun setValue(value: IHolographicCameraRenderingParameters3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCameraRenderingParameters3,
      IHolographicCameraRenderingParameters2.WithDefault,
      IHolographicCameraRenderingParameters.WithDefault {
    public val __295440131_Ptr: Pointer?

    public val _295440131_VtblPtr: Pointer?
      get() = __295440131_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsContentProtectionEnabled(): Boolean {
      val fnPtr = _295440131_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__295440131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsContentProtectionEnabled(value: Boolean): Unit {
      val fnPtr = _295440131_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__295440131_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicCameraRenderingParameters3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IHolographicCameraRenderingParameters2, IHolographicCameraRenderingParameters {
    public override val __295440132_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_295440131_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1672098314_Ptr: JNAPointer by lazy {
      val refiid =
          com.sun.jna.platform.win32.Guid.REFIID(IHolographicCameraRenderingParameters.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_295440131_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __295440131_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCameraRenderingParameters3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1aa513f136d4b06b9d4e4b914cd0683")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCameraRenderingParameters3(ptr: Pointer?): WithDefault =
        IHolographicCameraRenderingParameters3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCameraRenderingParameters3 {
      val address = segment.toRawLongValue()
      return makeIHolographicCameraRenderingParameters3(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCameraRenderingParameters3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__295440131_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCameraRenderingParameters3):
        Array<IHolographicCameraRenderingParameters3?> = (elements as
        Array<IHolographicCameraRenderingParameters3?>).castToImpl<IHolographicCameraRenderingParameters3,IHolographicCameraRenderingParameters3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCameraRenderingParameters3?> =
        arrayOfNulls<IHolographicCameraRenderingParameters3_Impl>(size) as
        Array<IHolographicCameraRenderingParameters3?>
  }
}
