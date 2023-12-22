package Windows.Devices.AllJoyn

import Windows.Globalization.Language
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AllJoynAboutDataView.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynAboutDataView;{6823111f-6212-4934-9c48-e19ca4984288})")
@WinRTByReference(brClass = AllJoynAboutDataView.ByReference::class)
public class AllJoynAboutDataView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynAboutDataView.WithDefault, IWinRTObject {
  private val __1095192651_Interface: IAllJoynAboutDataView.WithDefault by lazy {
    as_1095192651()
  }


  public override val __1095192651_Ptr: JNAPointer? by lazy {
    __1095192651_Interface.__1095192651_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1095192651_Interface)

  private fun as_1095192651(): IAllJoynAboutDataView.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynAboutDataView.ABI.makeIAllJoynAboutDataView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynAboutDataView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynAboutDataView.ABI.makeIAllJoynAboutDataView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynAboutDataView> {
    public override fun getValue() = AllJoynAboutDataView(pointer.getPointer(0))

    public fun setValue(value: AllJoynAboutDataView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynAboutDataView, MemoryAddress> {
    public val IAllJoynAboutDataViewStatics_Instance: IAllJoynAboutDataViewStatics by lazy {
      createIAllJoynAboutDataViewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynAboutDataViewStatics(): IAllJoynAboutDataViewStatics {
      val refiid = Guid.REFIID(IAllJoynAboutDataViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynAboutDataView".toHandle(),refiid,interfacePtr)
      val result =
          IAllJoynAboutDataViewStatics.ABI.makeIAllJoynAboutDataViewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AllJoynAboutDataView {
      val address = segment.toRawLongValue()
      return AllJoynAboutDataView(Pointer(address))
    }

    public override fun toNative(obj: AllJoynAboutDataView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDataBySessionPortAsync(
      uniqueName: String,
      busAttachment: AllJoynBusAttachment,
      sessionPort: WinDef.USHORT
    ) = ABI.IAllJoynAboutDataViewStatics_Instance.GetDataBySessionPortAsync(uniqueName,
        busAttachment, sessionPort)

    public fun GetDataBySessionPortAsync(
      uniqueName: String,
      busAttachment: AllJoynBusAttachment,
      sessionPort: WinDef.USHORT,
      language: Language
    ) = ABI.IAllJoynAboutDataViewStatics_Instance.GetDataBySessionPortAsync(uniqueName,
        busAttachment, sessionPort, language)
  }
}
