package Windows.Storage.Pickers

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FileSavePicker.ABI::class)
@Signature("rc(Windows.Storage.Pickers.FileSavePicker;{0ec313a2-d24b-449a-8197-e89104fd42cc})")
@WinRTByReference(brClass = FileSavePicker.ByReference::class)
public class FileSavePicker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileSavePicker2.WithDefault, IFileSavePicker3.WithDefault,
    IFileSavePicker.WithDefault, IFileSavePicker4.WithDefault, IWinRTObject {
  private val __906586135_Interface: IFileSavePicker2.WithDefault by lazy {
    as_906586135()
  }


  private val __906586134_Interface: IFileSavePicker3.WithDefault by lazy {
    as_906586134()
  }


  private val __663491945_Interface: IFileSavePicker.WithDefault by lazy {
    as_663491945()
  }


  private val __906586133_Interface: IFileSavePicker4.WithDefault by lazy {
    as_906586133()
  }


  public override val __906586135_Ptr: JNAPointer? by lazy {
    __906586135_Interface.__906586135_Ptr
  }


  public override val __906586134_Ptr: JNAPointer? by lazy {
    __906586134_Interface.__906586134_Ptr
  }


  public override val __663491945_Ptr: JNAPointer? by lazy {
    __663491945_Interface.__663491945_Ptr
  }


  public override val __906586133_Ptr: JNAPointer? by lazy {
    __906586133_Interface.__906586133_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__906586135_Interface, __906586134_Interface, __663491945_Interface,
        __906586133_Interface)

  public constructor() : this(ABI.activate())

  private fun as_906586135(): IFileSavePicker2.WithDefault {
    if(pointer == NULL) {
      return(IFileSavePicker2.ABI.makeIFileSavePicker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileSavePicker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileSavePicker2.ABI.makeIFileSavePicker2(ref.value))
  }

  private fun as_906586134(): IFileSavePicker3.WithDefault {
    if(pointer == NULL) {
      return(IFileSavePicker3.ABI.makeIFileSavePicker3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileSavePicker3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileSavePicker3.ABI.makeIFileSavePicker3(ref.value))
  }

  private fun as_663491945(): IFileSavePicker.WithDefault {
    if(pointer == NULL) {
      return(IFileSavePicker.ABI.makeIFileSavePicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileSavePicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileSavePicker.ABI.makeIFileSavePicker(ref.value))
  }

  private fun as_906586133(): IFileSavePicker4.WithDefault {
    if(pointer == NULL) {
      return(IFileSavePicker4.ABI.makeIFileSavePicker4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileSavePicker4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileSavePicker4.ABI.makeIFileSavePicker4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FileSavePicker>
      {
    public override fun getValue() = FileSavePicker(pointer.getPointer(0))

    public fun setValue(value: FileSavePicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileSavePicker, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IFileSavePickerStatics_Instance: IFileSavePickerStatics by lazy {
      createIFileSavePickerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Storage.Pickers.FileSavePicker".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIFileSavePickerStatics(): IFileSavePickerStatics {
      val refiid = Guid.REFIID(IFileSavePickerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Pickers.FileSavePicker".toHandle(),refiid,interfacePtr)
      val result = IFileSavePickerStatics.ABI.makeIFileSavePickerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FileSavePicker {
      val address = segment.toRawLongValue()
      return FileSavePicker(Pointer(address))
    }

    public override fun toNative(obj: FileSavePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForUser(user: User) = ABI.IFileSavePickerStatics_Instance.CreateForUser(user)
  }
}
