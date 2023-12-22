package Windows.UI.Input.Spatial

import Windows.UI.Input.Spatial.ISpatialPointerPose.ABI.IID
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

@ABIMarker(ISpatialPointerPose2.ABI::class)
@Signature("{9d202b17-954e-4e0c-96d1-b6790b6fc2fd}")
@Guid("9d202b17954e4e0c96d1b6790b6fc2fd")
@WinRTInterface("9d202b17954e4e0c96d1b6790b6fc2fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialPointerPose2.ByReference::class)
public interface ISpatialPointerPose2 : NativeMapped, IWinRTInterface, ISpatialPointerPose {
  @InterfaceMethod(0)
  public fun TryGetInteractionSourcePose(source: SpatialInteractionSource?):
      SpatialPointerInteractionSourcePose?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialPointerPose2> {
    public override fun getValue() = ABI.makeISpatialPointerPose2(pointer.getPointer(0))

    public fun setValue(value: ISpatialPointerPose2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialPointerPose2, ISpatialPointerPose.WithDefault {
    public val __609233936_Ptr: Pointer?

    public val _609233936_VtblPtr: Pointer?
      get() = __609233936_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetInteractionSourcePose(source: SpatialInteractionSource?):
        SpatialPointerInteractionSourcePose? {
      val fnPtr = _609233936_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialPointerInteractionSourcePose>()
      val hr = fn.invokeHR(arrayOf(__609233936_Ptr, marshalToNative(source), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialPointerInteractionSourcePose>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialPointerPose2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISpatialPointerPose {
    public override val __19652706_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_609233936_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __609233936_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialPointerPose2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d202b17954e4e0c96d1b6790b6fc2fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialPointerPose2(ptr: Pointer?): WithDefault = ISpatialPointerPose2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialPointerPose2 {
      val address = segment.toRawLongValue()
      return makeISpatialPointerPose2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialPointerPose2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__609233936_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialPointerPose2): Array<ISpatialPointerPose2?> =
        (elements as
        Array<ISpatialPointerPose2?>).castToImpl<ISpatialPointerPose2,ISpatialPointerPose2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialPointerPose2?> =
        arrayOfNulls<ISpatialPointerPose2_Impl>(size) as Array<ISpatialPointerPose2?>
  }
}
