package Windows.Media.Devices.Core

import Windows.Foundation.Numerics.Vector2
import Windows.Foundation.Numerics.Vector3
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICameraIntrinsicsFactory.ABI::class)
@Signature("{c0ddc486-2132-4a34-a659-9bfe2a055712}")
@Guid("c0ddc48621324a34a6599bfe2a055712")
@WinRTInterface("c0ddc48621324a34a6599bfe2a055712")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraIntrinsicsFactory.ByReference::class)
public interface ICameraIntrinsicsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    focalLength: Vector2?,
    principalPoint: Vector2?,
    radialDistortion: Vector3?,
    tangentialDistortion: Vector2?,
    imageWidth: WinDef.UINT,
    imageHeight: WinDef.UINT
  ): CameraIntrinsics?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraIntrinsicsFactory> {
    public override fun getValue() = ABI.makeICameraIntrinsicsFactory(pointer.getPointer(0))

    public fun setValue(value: ICameraIntrinsicsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraIntrinsicsFactory {
    public val __1370010477_Ptr: Pointer?

    public val _1370010477_VtblPtr: Pointer?
      get() = __1370010477_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      focalLength: Vector2?,
      principalPoint: Vector2?,
      radialDistortion: Vector3?,
      tangentialDistortion: Vector2?,
      imageWidth: WinDef.UINT,
      imageHeight: WinDef.UINT
    ): CameraIntrinsics? {
      val fnPtr = _1370010477_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraIntrinsics>()
      val hr = fn.invokeHR(arrayOf(__1370010477_Ptr, marshalToNative(focalLength),
          marshalToNative(principalPoint), marshalToNative(radialDistortion),
          marshalToNative(tangentialDistortion), imageWidth, imageHeight, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraIntrinsics>(result.getValue())
      return resultValue
    }
  }

  public class ICameraIntrinsicsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1370010477_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraIntrinsicsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0ddc48621324a34a6599bfe2a055712")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraIntrinsicsFactory(ptr: Pointer?): WithDefault =
        ICameraIntrinsicsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraIntrinsicsFactory {
      val address = segment.toRawLongValue()
      return makeICameraIntrinsicsFactory(Pointer(address))
    }

    public override fun toNative(obj: ICameraIntrinsicsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1370010477_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraIntrinsicsFactory):
        Array<ICameraIntrinsicsFactory?> = (elements as
        Array<ICameraIntrinsicsFactory?>).castToImpl<ICameraIntrinsicsFactory,ICameraIntrinsicsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraIntrinsicsFactory?> =
        arrayOfNulls<ICameraIntrinsicsFactory_Impl>(size) as Array<ICameraIntrinsicsFactory?>
  }
}
