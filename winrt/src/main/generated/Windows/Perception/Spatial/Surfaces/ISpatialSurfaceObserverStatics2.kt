package Windows.Perception.Spatial.Surfaces

import Windows.Perception.Spatial.Surfaces.ISpatialSurfaceObserverStatics.ABI.IID
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

@ABIMarker(ISpatialSurfaceObserverStatics2.ABI::class)
@Signature("{0f534261-c55d-4e6b-a895-a19de69a42e3}")
@Guid("0f534261c55d4e6ba895a19de69a42e3")
@WinRTInterface("0f534261c55d4e6ba895a19de69a42e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialSurfaceObserverStatics2.ByReference::class)
public interface ISpatialSurfaceObserverStatics2 : NativeMapped, IWinRTInterface,
    ISpatialSurfaceObserverStatics {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialSurfaceObserverStatics2> {
    public override fun getValue() = ABI.makeISpatialSurfaceObserverStatics2(pointer.getPointer(0))

    public fun setValue(value: ISpatialSurfaceObserverStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialSurfaceObserverStatics2,
      ISpatialSurfaceObserverStatics.WithDefault {
    public val __1305764807_Ptr: Pointer?

    public val _1305764807_VtblPtr: Pointer?
      get() = __1305764807_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _1305764807_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1305764807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISpatialSurfaceObserverStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISpatialSurfaceObserverStatics {
    public override val __789162549_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1305764807_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1305764807_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialSurfaceObserverStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f534261c55d4e6ba895a19de69a42e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialSurfaceObserverStatics2(ptr: Pointer?): WithDefault =
        ISpatialSurfaceObserverStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialSurfaceObserverStatics2 {
      val address = segment.toRawLongValue()
      return makeISpatialSurfaceObserverStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialSurfaceObserverStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1305764807_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialSurfaceObserverStatics2):
        Array<ISpatialSurfaceObserverStatics2?> = (elements as
        Array<ISpatialSurfaceObserverStatics2?>).castToImpl<ISpatialSurfaceObserverStatics2,ISpatialSurfaceObserverStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialSurfaceObserverStatics2?> =
        arrayOfNulls<ISpatialSurfaceObserverStatics2_Impl>(size) as
        Array<ISpatialSurfaceObserverStatics2?>
  }
}
