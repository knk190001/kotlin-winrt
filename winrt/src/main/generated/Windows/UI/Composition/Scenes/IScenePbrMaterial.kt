package Windows.UI.Composition.Scenes

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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScenePbrMaterial.ABI::class)
@Signature("{aab6ebbe-d680-46df-8294-b6800a9f95e7}")
@Guid("aab6ebbed68046df8294b6800a9f95e7")
@WinRTInterface("aab6ebbed68046df8294b6800a9f95e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScenePbrMaterial.ByReference::class)
public interface IScenePbrMaterial : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlphaCutoff(): Float

  @InterfaceMethod(1)
  public fun put_AlphaCutoff(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_AlphaMode(): SceneAlphaMode?

  @InterfaceMethod(3)
  public fun put_AlphaMode(value: SceneAlphaMode?): Unit

  @InterfaceMethod(4)
  public fun get_EmissiveInput(): SceneMaterialInput?

  @InterfaceMethod(5)
  public fun put_EmissiveInput(value: SceneMaterialInput?): Unit

  @InterfaceMethod(6)
  public fun get_EmissiveFactor(): Vector3?

  @InterfaceMethod(7)
  public fun put_EmissiveFactor(value: Vector3?): Unit

  @InterfaceMethod(8)
  public fun get_IsDoubleSided(): Boolean

  @InterfaceMethod(9)
  public fun put_IsDoubleSided(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_NormalInput(): SceneMaterialInput?

  @InterfaceMethod(11)
  public fun put_NormalInput(value: SceneMaterialInput?): Unit

  @InterfaceMethod(12)
  public fun get_NormalScale(): Float

  @InterfaceMethod(13)
  public fun put_NormalScale(value: Float): Unit

  @InterfaceMethod(14)
  public fun get_OcclusionInput(): SceneMaterialInput?

  @InterfaceMethod(15)
  public fun put_OcclusionInput(value: SceneMaterialInput?): Unit

  @InterfaceMethod(16)
  public fun get_OcclusionStrength(): Float

  @InterfaceMethod(17)
  public fun put_OcclusionStrength(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScenePbrMaterial> {
    public override fun getValue() = ABI.makeIScenePbrMaterial(pointer.getPointer(0))

    public fun setValue(value: IScenePbrMaterial_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScenePbrMaterial {
    public val __2146218186_Ptr: Pointer?

    public val _2146218186_VtblPtr: Pointer?
      get() = __2146218186_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlphaCutoff(): Float {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AlphaCutoff(value: Float): Unit {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AlphaMode(): SceneAlphaMode? {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneAlphaMode>()
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneAlphaMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AlphaMode(value: SceneAlphaMode?): Unit {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_EmissiveInput(): SceneMaterialInput? {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneMaterialInput>()
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneMaterialInput>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_EmissiveInput(value: SceneMaterialInput?): Unit {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_EmissiveFactor(): Vector3? {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_EmissiveFactor(value: Vector3?): Unit {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsDoubleSided(): Boolean {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsDoubleSided(value: Boolean): Unit {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_NormalInput(): SceneMaterialInput? {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneMaterialInput>()
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneMaterialInput>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_NormalInput(value: SceneMaterialInput?): Unit {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_NormalScale(): Float {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_NormalScale(value: Float): Unit {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_OcclusionInput(): SceneMaterialInput? {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneMaterialInput>()
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneMaterialInput>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_OcclusionInput(value: SceneMaterialInput?): Unit {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_OcclusionStrength(): Float {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_OcclusionStrength(value: Float): Unit {
      val fnPtr = _2146218186_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2146218186_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScenePbrMaterial_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2146218186_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScenePbrMaterial, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aab6ebbed68046df8294b6800a9f95e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScenePbrMaterial(ptr: Pointer?): WithDefault = IScenePbrMaterial_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScenePbrMaterial {
      val address = segment.toRawLongValue()
      return makeIScenePbrMaterial(Pointer(address))
    }

    public override fun toNative(obj: IScenePbrMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2146218186_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScenePbrMaterial): Array<IScenePbrMaterial?> = (elements
        as Array<IScenePbrMaterial?>).castToImpl<IScenePbrMaterial,IScenePbrMaterial_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScenePbrMaterial?> =
        arrayOfNulls<IScenePbrMaterial_Impl>(size) as Array<IScenePbrMaterial?>
  }
}
