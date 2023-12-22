package Windows.UI.Input.Spatial

import Windows.Foundation.Numerics.Quaternion
import Windows.UI.Input.Spatial.ISpatialPointerInteractionSourcePose.ABI.IID
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

@ABIMarker(ISpatialPointerInteractionSourcePose2.ABI::class)
@Signature("{eccd86b8-52db-469f-9e3f-80c47f74bce9}")
@Guid("eccd86b852db469f9e3f80c47f74bce9")
@WinRTInterface("eccd86b852db469f9e3f80c47f74bce9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialPointerInteractionSourcePose2.ByReference::class)
public interface ISpatialPointerInteractionSourcePose2 : NativeMapped, IWinRTInterface,
    ISpatialPointerInteractionSourcePose {
  @InterfaceMethod(0)
  public fun get_Orientation(): Quaternion?

  @InterfaceMethod(1)
  public fun get_PositionAccuracy(): SpatialInteractionSourcePositionAccuracy?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialPointerInteractionSourcePose2> {
    public override fun getValue() =
        ABI.makeISpatialPointerInteractionSourcePose2(pointer.getPointer(0))

    public fun setValue(value: ISpatialPointerInteractionSourcePose2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialPointerInteractionSourcePose2,
      ISpatialPointerInteractionSourcePose.WithDefault {
    public val __245626235_Ptr: Pointer?

    public val _245626235_VtblPtr: Pointer?
      get() = __245626235_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Orientation(): Quaternion? {
      val fnPtr = _245626235_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Quaternion>()
      val hr = fn.invokeHR(arrayOf(__245626235_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Quaternion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PositionAccuracy(): SpatialInteractionSourcePositionAccuracy? {
      val fnPtr = _245626235_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourcePositionAccuracy>()
      val hr = fn.invokeHR(arrayOf(__245626235_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SpatialInteractionSourcePositionAccuracy>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialPointerInteractionSourcePose2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      ISpatialPointerInteractionSourcePose {
    public override val __1654644557_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_245626235_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __245626235_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialPointerInteractionSourcePose2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eccd86b852db469f9e3f80c47f74bce9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialPointerInteractionSourcePose2(ptr: Pointer?): WithDefault =
        ISpatialPointerInteractionSourcePose2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialPointerInteractionSourcePose2 {
      val address = segment.toRawLongValue()
      return makeISpatialPointerInteractionSourcePose2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialPointerInteractionSourcePose2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__245626235_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialPointerInteractionSourcePose2):
        Array<ISpatialPointerInteractionSourcePose2?> = (elements as
        Array<ISpatialPointerInteractionSourcePose2?>).castToImpl<ISpatialPointerInteractionSourcePose2,ISpatialPointerInteractionSourcePose2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialPointerInteractionSourcePose2?> =
        arrayOfNulls<ISpatialPointerInteractionSourcePose2_Impl>(size) as
        Array<ISpatialPointerInteractionSourcePose2?>
  }
}
