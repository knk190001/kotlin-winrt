package Windows.UI.Input.Spatial

import Windows.Foundation.IReference
import Windows.Foundation.Numerics.Vector3
import Windows.UI.Input.Spatial.ISpatialInteractionSourceLocation2.ABI.IID
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

@ABIMarker(ISpatialInteractionSourceLocation3.ABI::class)
@Signature("{6702e65e-e915-4cfb-9c1b-0538efc86687}")
@Guid("6702e65ee9154cfb9c1b0538efc86687")
@WinRTInterface("6702e65ee9154cfb9c1b0538efc86687")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSourceLocation3.ByReference::class)
public interface ISpatialInteractionSourceLocation3 : NativeMapped, IWinRTInterface,
    ISpatialInteractionSourceLocation2 {
  @InterfaceMethod(0)
  public fun get_PositionAccuracy(): SpatialInteractionSourcePositionAccuracy?

  @InterfaceMethod(1)
  public fun get_AngularVelocity(): IReference<Vector3?>?

  @InterfaceMethod(2)
  public fun get_SourcePointerPose(): SpatialPointerInteractionSourcePose?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSourceLocation3> {
    public override fun getValue() =
        ABI.makeISpatialInteractionSourceLocation3(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSourceLocation3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSourceLocation3,
      ISpatialInteractionSourceLocation2.WithDefault {
    public val __1769611683_Ptr: Pointer?

    public val _1769611683_VtblPtr: Pointer?
      get() = __1769611683_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PositionAccuracy(): SpatialInteractionSourcePositionAccuracy? {
      val fnPtr = _1769611683_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourcePositionAccuracy>()
      val hr = fn.invokeHR(arrayOf(__1769611683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SpatialInteractionSourcePositionAccuracy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AngularVelocity(): IReference<Vector3?>? {
      val fnPtr = _1769611683_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Vector3?>>()
      val hr = fn.invokeHR(arrayOf(__1769611683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Vector3?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SourcePointerPose(): SpatialPointerInteractionSourcePose? {
      val fnPtr = _1769611683_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialPointerInteractionSourcePose>()
      val hr = fn.invokeHR(arrayOf(__1769611683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialPointerInteractionSourcePose>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSourceLocation3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      ISpatialInteractionSourceLocation2 {
    public override val __1769611684_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1769611683_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1769611683_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSourceLocation3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6702e65ee9154cfb9c1b0538efc86687")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSourceLocation3(ptr: Pointer?): WithDefault =
        ISpatialInteractionSourceLocation3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSourceLocation3 {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSourceLocation3(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSourceLocation3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1769611683_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSourceLocation3):
        Array<ISpatialInteractionSourceLocation3?> = (elements as
        Array<ISpatialInteractionSourceLocation3?>).castToImpl<ISpatialInteractionSourceLocation3,ISpatialInteractionSourceLocation3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSourceLocation3?> =
        arrayOfNulls<ISpatialInteractionSourceLocation3_Impl>(size) as
        Array<ISpatialInteractionSourceLocation3?>
  }
}
