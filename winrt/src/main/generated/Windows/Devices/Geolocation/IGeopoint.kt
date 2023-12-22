package Windows.Devices.Geolocation

import Windows.Devices.Geolocation.IGeoshape.ABI.IID
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

@ABIMarker(IGeopoint.ABI::class)
@Signature("{6bfa00eb-e56e-49bb-9caf-cbaa78a8bcef}")
@Guid("6bfa00ebe56e49bb9cafcbaa78a8bcef")
@WinRTInterface("6bfa00ebe56e49bb9cafcbaa78a8bcef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeopoint.ByReference::class)
public interface IGeopoint : NativeMapped, IWinRTInterface, IGeoshape {
  @InterfaceMethod(0)
  public fun get_Position(): BasicGeoposition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGeopoint> {
    public override fun getValue() = ABI.makeIGeopoint(pointer.getPointer(0))

    public fun setValue(value: IGeopoint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeopoint, IGeoshape.WithDefault {
    public val __247161506_Ptr: Pointer?

    public val _247161506_VtblPtr: Pointer?
      get() = __247161506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): BasicGeoposition? {
      val fnPtr = _247161506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BasicGeoposition>()
      val hr = fn.invokeHR(arrayOf(__247161506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BasicGeoposition>(result.getValue())
      return resultValue
    }
  }

  public class IGeopoint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGeoshape {
    public override val __244607121_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_247161506_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __247161506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeopoint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6bfa00ebe56e49bb9cafcbaa78a8bcef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeopoint(ptr: Pointer?): WithDefault = IGeopoint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeopoint {
      val address = segment.toRawLongValue()
      return makeIGeopoint(Pointer(address))
    }

    public override fun toNative(obj: IGeopoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__247161506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeopoint): Array<IGeopoint?> = (elements as
        Array<IGeopoint?>).castToImpl<IGeopoint,IGeopoint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeopoint?> = arrayOfNulls<IGeopoint_Impl>(size)
        as Array<IGeopoint?>
  }
}
