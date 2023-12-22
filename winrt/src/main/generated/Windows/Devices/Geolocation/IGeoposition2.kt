package Windows.Devices.Geolocation

import Windows.Devices.Geolocation.IGeoposition.ABI.IID
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

@ABIMarker(IGeoposition2.ABI::class)
@Signature("{7f62f697-8671-4b0d-86f8-474a8496187c}")
@Guid("7f62f69786714b0d86f8474a8496187c")
@WinRTInterface("7f62f69786714b0d86f8474a8496187c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeoposition2.ByReference::class)
public interface IGeoposition2 : NativeMapped, IWinRTInterface, IGeoposition {
  @InterfaceMethod(0)
  public fun get_VenueData(): VenueData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGeoposition2>
      {
    public override fun getValue() = ABI.makeIGeoposition2(pointer.getPointer(0))

    public fun setValue(value: IGeoposition2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeoposition2, IGeoposition.WithDefault {
    public val __1635925239_Ptr: Pointer?

    public val _1635925239_VtblPtr: Pointer?
      get() = __1635925239_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VenueData(): VenueData? {
      val fnPtr = _1635925239_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VenueData>()
      val hr = fn.invokeHR(arrayOf(__1635925239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VenueData>(result.getValue())
      return resultValue
    }
  }

  public class IGeoposition2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGeoposition {
    public override val __1332701541_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1635925239_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1635925239_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeoposition2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f62f69786714b0d86f8474a8496187c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeoposition2(ptr: Pointer?): WithDefault = IGeoposition2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeoposition2 {
      val address = segment.toRawLongValue()
      return makeIGeoposition2(Pointer(address))
    }

    public override fun toNative(obj: IGeoposition2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1635925239_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeoposition2): Array<IGeoposition2?> = (elements as
        Array<IGeoposition2?>).castToImpl<IGeoposition2,IGeoposition2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeoposition2?> =
        arrayOfNulls<IGeoposition2_Impl>(size) as Array<IGeoposition2?>
  }
}
