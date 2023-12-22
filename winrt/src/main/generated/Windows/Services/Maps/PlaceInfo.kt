package Windows.Services.Maps

import Windows.Devices.Geolocation.Geopoint
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PlaceInfo.ABI::class)
@Signature("rc(Windows.Services.Maps.PlaceInfo;{9a0810b6-31c8-4f6a-9f18-950b4c38951a})")
@WinRTByReference(brClass = PlaceInfo.ByReference::class)
public class PlaceInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlaceInfo.WithDefault, IWinRTObject {
  private val __589103384_Interface: IPlaceInfo.WithDefault by lazy {
    as_589103384()
  }


  public override val __589103384_Ptr: JNAPointer? by lazy {
    __589103384_Interface.__589103384_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__589103384_Interface)

  private fun as_589103384(): IPlaceInfo.WithDefault {
    if(pointer == NULL) {
      return(IPlaceInfo.ABI.makeIPlaceInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlaceInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlaceInfo.ABI.makeIPlaceInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PlaceInfo> {
    public override fun getValue() = PlaceInfo(pointer.getPointer(0))

    public fun setValue(value: PlaceInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlaceInfo, MemoryAddress> {
    public val IPlaceInfoStatics2_Instance: IPlaceInfoStatics2 by lazy {
      createIPlaceInfoStatics2()
    }


    public val IPlaceInfoStatics_Instance: IPlaceInfoStatics by lazy {
      createIPlaceInfoStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlaceInfoStatics2(): IPlaceInfoStatics2 {
      val refiid = Guid.REFIID(IPlaceInfoStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.PlaceInfo".toHandle(),refiid,interfacePtr)
      val result = IPlaceInfoStatics2.ABI.makeIPlaceInfoStatics2(interfacePtr.value)
      return result
    }

    public fun createIPlaceInfoStatics(): IPlaceInfoStatics {
      val refiid = Guid.REFIID(IPlaceInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.PlaceInfo".toHandle(),refiid,interfacePtr)
      val result = IPlaceInfoStatics.ABI.makeIPlaceInfoStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PlaceInfo {
      val address = segment.toRawLongValue()
      return PlaceInfo(Pointer(address))
    }

    public override fun toNative(obj: PlaceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromAddress(displayAddress: String) =
        ABI.IPlaceInfoStatics2_Instance.CreateFromAddress(displayAddress)

    public fun CreateFromAddress(displayAddress: String, displayName: String) =
        ABI.IPlaceInfoStatics2_Instance.CreateFromAddress(displayAddress, displayName)

    public fun Create(referencePoint: Geopoint) =
        ABI.IPlaceInfoStatics_Instance.Create(referencePoint)

    public fun Create(referencePoint: Geopoint, options: PlaceInfoCreateOptions) =
        ABI.IPlaceInfoStatics_Instance.Create(referencePoint, options)

    public fun CreateFromIdentifier(identifier: String) =
        ABI.IPlaceInfoStatics_Instance.CreateFromIdentifier(identifier)

    public fun CreateFromIdentifier(
      identifier: String,
      defaultPoint: Geopoint,
      options: PlaceInfoCreateOptions
    ) = ABI.IPlaceInfoStatics_Instance.CreateFromIdentifier(identifier, defaultPoint, options)

    public fun CreateFromMapLocation(location: MapLocation) =
        ABI.IPlaceInfoStatics_Instance.CreateFromMapLocation(location)

    public fun get_IsShowSupported() = ABI.IPlaceInfoStatics_Instance.get_IsShowSupported()
  }
}
