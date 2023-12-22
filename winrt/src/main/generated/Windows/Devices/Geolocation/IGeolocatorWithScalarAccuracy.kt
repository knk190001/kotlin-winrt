package Windows.Devices.Geolocation

import Windows.Devices.Geolocation.IGeolocator.ABI.IID
import Windows.Foundation.IReference
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IGeolocatorWithScalarAccuracy.ABI::class)
@Signature("{96f5d3c1-b80f-460a-994d-a96c47a51aa4}")
@Guid("96f5d3c1b80f460a994da96c47a51aa4")
@WinRTInterface("96f5d3c1b80f460a994da96c47a51aa4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeolocatorWithScalarAccuracy.ByReference::class)
public interface IGeolocatorWithScalarAccuracy : NativeMapped, IWinRTInterface, IGeolocator {
  @InterfaceMethod(0)
  public fun get_DesiredAccuracyInMeters(): IReference<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun put_DesiredAccuracyInMeters(value: IReference<WinDef.UINT>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeolocatorWithScalarAccuracy> {
    public override fun getValue() = ABI.makeIGeolocatorWithScalarAccuracy(pointer.getPointer(0))

    public fun setValue(value: IGeolocatorWithScalarAccuracy_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeolocatorWithScalarAccuracy, IGeolocator.WithDefault {
    public val __1615294319_Ptr: Pointer?

    public val _1615294319_VtblPtr: Pointer?
      get() = __1615294319_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredAccuracyInMeters(): IReference<WinDef.UINT>? {
      val fnPtr = _1615294319_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1615294319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DesiredAccuracyInMeters(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _1615294319_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1615294319_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGeolocatorWithScalarAccuracy_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGeolocator {
    public override val __559978268_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1615294319_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1615294319_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeolocatorWithScalarAccuracy, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96f5d3c1b80f460a994da96c47a51aa4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeolocatorWithScalarAccuracy(ptr: Pointer?): WithDefault =
        IGeolocatorWithScalarAccuracy_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeolocatorWithScalarAccuracy {
      val address = segment.toRawLongValue()
      return makeIGeolocatorWithScalarAccuracy(Pointer(address))
    }

    public override fun toNative(obj: IGeolocatorWithScalarAccuracy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1615294319_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeolocatorWithScalarAccuracy):
        Array<IGeolocatorWithScalarAccuracy?> = (elements as
        Array<IGeolocatorWithScalarAccuracy?>).castToImpl<IGeolocatorWithScalarAccuracy,IGeolocatorWithScalarAccuracy_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeolocatorWithScalarAccuracy?> =
        arrayOfNulls<IGeolocatorWithScalarAccuracy_Impl>(size) as
        Array<IGeolocatorWithScalarAccuracy?>
  }
}
