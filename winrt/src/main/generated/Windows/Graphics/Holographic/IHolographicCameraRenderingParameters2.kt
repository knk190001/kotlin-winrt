package Windows.Graphics.Holographic

import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import Windows.Graphics.Holographic.IHolographicCameraRenderingParameters.ABI.IID
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

@ABIMarker(IHolographicCameraRenderingParameters2.ABI::class)
@Signature("{261270e3-b696-4634-94d6-be0681643599}")
@Guid("261270e3b696463494d6be0681643599")
@WinRTInterface("261270e3b696463494d6be0681643599")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCameraRenderingParameters2.ByReference::class)
public interface IHolographicCameraRenderingParameters2 : NativeMapped, IWinRTInterface,
    IHolographicCameraRenderingParameters {
  @InterfaceMethod(0)
  public fun get_ReprojectionMode(): HolographicReprojectionMode?

  @InterfaceMethod(1)
  public fun put_ReprojectionMode(value: HolographicReprojectionMode?): Unit

  @InterfaceMethod(2)
  public fun CommitDirect3D11DepthBuffer(value: IDirect3DSurface?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCameraRenderingParameters2> {
    public override fun getValue() =
        ABI.makeIHolographicCameraRenderingParameters2(pointer.getPointer(0))

    public fun setValue(value: IHolographicCameraRenderingParameters2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCameraRenderingParameters2,
      IHolographicCameraRenderingParameters.WithDefault {
    public val __295440132_Ptr: Pointer?

    public val _295440132_VtblPtr: Pointer?
      get() = __295440132_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReprojectionMode(): HolographicReprojectionMode? {
      val fnPtr = _295440132_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicReprojectionMode>()
      val hr = fn.invokeHR(arrayOf(__295440132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicReprojectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ReprojectionMode(value: HolographicReprojectionMode?): Unit {
      val fnPtr = _295440132_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__295440132_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun CommitDirect3D11DepthBuffer(value: IDirect3DSurface?): Unit {
      val fnPtr = _295440132_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__295440132_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicCameraRenderingParameters2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IHolographicCameraRenderingParameters {
    public override val __1672098314_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_295440132_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __295440132_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCameraRenderingParameters2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("261270e3b696463494d6be0681643599")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCameraRenderingParameters2(ptr: Pointer?): WithDefault =
        IHolographicCameraRenderingParameters2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCameraRenderingParameters2 {
      val address = segment.toRawLongValue()
      return makeIHolographicCameraRenderingParameters2(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCameraRenderingParameters2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__295440132_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCameraRenderingParameters2):
        Array<IHolographicCameraRenderingParameters2?> = (elements as
        Array<IHolographicCameraRenderingParameters2?>).castToImpl<IHolographicCameraRenderingParameters2,IHolographicCameraRenderingParameters2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCameraRenderingParameters2?> =
        arrayOfNulls<IHolographicCameraRenderingParameters2_Impl>(size) as
        Array<IHolographicCameraRenderingParameters2?>
  }
}
