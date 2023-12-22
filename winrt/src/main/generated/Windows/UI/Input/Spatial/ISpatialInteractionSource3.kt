package Windows.UI.Input.Spatial

import Windows.UI.Input.Spatial.ISpatialInteractionSource2.ABI.IID
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

@ABIMarker(ISpatialInteractionSource3.ABI::class)
@Signature("{0406d9f9-9afd-44f9-85dc-700023a962e3}")
@Guid("0406d9f99afd44f985dc700023a962e3")
@WinRTInterface("0406d9f99afd44f985dc700023a962e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSource3.ByReference::class)
public interface ISpatialInteractionSource3 : NativeMapped, IWinRTInterface,
    ISpatialInteractionSource2, ISpatialInteractionSource {
  @InterfaceMethod(0)
  public fun get_Handedness(): SpatialInteractionSourceHandedness?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSource3> {
    public override fun getValue() = ABI.makeISpatialInteractionSource3(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSource3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSource3, ISpatialInteractionSource2.WithDefault,
      ISpatialInteractionSource.WithDefault {
    public val __1851771246_Ptr: Pointer?

    public val _1851771246_VtblPtr: Pointer?
      get() = __1851771246_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handedness(): SpatialInteractionSourceHandedness? {
      val fnPtr = _1851771246_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceHandedness>()
      val hr = fn.invokeHR(arrayOf(__1851771246_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceHandedness>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSource3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISpatialInteractionSource2,
      ISpatialInteractionSource {
    public override val __1851771247_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1851771246_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1168113215_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(ISpatialInteractionSource.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1851771246_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1851771246_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSource3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0406d9f99afd44f985dc700023a962e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSource3(ptr: Pointer?): WithDefault =
        ISpatialInteractionSource3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSource3 {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSource3(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSource3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1851771246_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSource3):
        Array<ISpatialInteractionSource3?> = (elements as
        Array<ISpatialInteractionSource3?>).castToImpl<ISpatialInteractionSource3,ISpatialInteractionSource3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSource3?> =
        arrayOfNulls<ISpatialInteractionSource3_Impl>(size) as Array<ISpatialInteractionSource3?>
  }
}
