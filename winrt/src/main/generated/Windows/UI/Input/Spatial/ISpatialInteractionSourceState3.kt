package Windows.UI.Input.Spatial

import Windows.Perception.People.HandPose
import Windows.UI.Input.Spatial.ISpatialInteractionSourceState2.ABI.IID
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

@ABIMarker(ISpatialInteractionSourceState3.ABI::class)
@Signature("{f2f00bc2-bd2b-4a01-a8fb-323e0158527c}")
@Guid("f2f00bc2bd2b4a01a8fb323e0158527c")
@WinRTInterface("f2f00bc2bd2b4a01a8fb323e0158527c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSourceState3.ByReference::class)
public interface ISpatialInteractionSourceState3 : NativeMapped, IWinRTInterface,
    ISpatialInteractionSourceState2, ISpatialInteractionSourceState {
  @InterfaceMethod(0)
  public fun TryGetHandPose(): HandPose?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSourceState3> {
    public override fun getValue() = ABI.makeISpatialInteractionSourceState3(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSourceState3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSourceState3,
      ISpatialInteractionSourceState2.WithDefault, ISpatialInteractionSourceState.WithDefault {
    public val __832526621_Ptr: Pointer?

    public val _832526621_VtblPtr: Pointer?
      get() = __832526621_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetHandPose(): HandPose? {
      val fnPtr = _832526621_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HandPose>()
      val hr = fn.invokeHR(arrayOf(__832526621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HandPose>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSourceState3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISpatialInteractionSourceState2,
      ISpatialInteractionSourceState {
    public override val __832526622_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_832526621_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __996687024_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(ISpatialInteractionSourceState.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_832526621_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __832526621_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSourceState3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2f00bc2bd2b4a01a8fb323e0158527c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSourceState3(ptr: Pointer?): WithDefault =
        ISpatialInteractionSourceState3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSourceState3 {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSourceState3(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSourceState3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__832526621_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSourceState3):
        Array<ISpatialInteractionSourceState3?> = (elements as
        Array<ISpatialInteractionSourceState3?>).castToImpl<ISpatialInteractionSourceState3,ISpatialInteractionSourceState3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSourceState3?> =
        arrayOfNulls<ISpatialInteractionSourceState3_Impl>(size) as
        Array<ISpatialInteractionSourceState3?>
  }
}
