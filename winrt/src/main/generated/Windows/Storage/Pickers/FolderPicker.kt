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

@ABIMarker(FolderPicker.ABI::class)
@Signature("rc(Windows.Storage.Pickers.FolderPicker;{8eb3ba97-dc85-4616-be94-9660881f2f5d})")
@WinRTByReference(brClass = FolderPicker.ByReference::class)
public class FolderPicker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFolderPicker2.WithDefault, IFolderPicker.WithDefault,
    IFolderPicker3.WithDefault, IWinRTObject {
  private val __1762225780_Interface: IFolderPicker2.WithDefault by lazy {
    as_1762225780()
  }


  private val __1328627330_Interface: IFolderPicker.WithDefault by lazy {
    as_1328627330()
  }


  private val __1762225781_Interface: IFolderPicker3.WithDefault by lazy {
    as_1762225781()
  }


  public override val __1762225780_Ptr: JNAPointer? by lazy {
    __1762225780_Interface.__1762225780_Ptr
  }


  public override val __1328627330_Ptr: JNAPointer? by lazy {
    __1328627330_Interface.__1328627330_Ptr
  }


  public override val __1762225781_Ptr: JNAPointer? by lazy {
    __1762225781_Interface.__1762225781_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1762225780_Interface, __1328627330_Interface, __1762225781_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1762225780(): IFolderPicker2.WithDefault {
    if(pointer == NULL) {
      return(IFolderPicker2.ABI.makeIFolderPicker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFolderPicker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFolderPicker2.ABI.makeIFolderPicker2(ref.value))
  }

  private fun as_1328627330(): IFolderPicker.WithDefault {
    if(pointer == NULL) {
      return(IFolderPicker.ABI.makeIFolderPicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFolderPicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFolderPicker.ABI.makeIFolderPicker(ref.value))
  }

  private fun as_1762225781(): IFolderPicker3.WithDefault {
    if(pointer == NULL) {
      return(IFolderPicker3.ABI.makeIFolderPicker3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFolderPicker3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFolderPicker3.ABI.makeIFolderPicker3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FolderPicker> {
    public override fun getValue() = FolderPicker(pointer.getPointer(0))

    public fun setValue(value: FolderPicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FolderPicker, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IFolderPickerStatics_Instance: IFolderPickerStatics by lazy {
      createIFolderPickerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Storage.Pickers.FolderPicker".toHandle(),
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

    public fun createIFolderPickerStatics(): IFolderPickerStatics {
      val refiid = Guid.REFIID(IFolderPickerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Pickers.FolderPicker".toHandle(),refiid,interfacePtr)
      val result = IFolderPickerStatics.ABI.makeIFolderPickerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FolderPicker {
      val address = segment.toRawLongValue()
      return FolderPicker(Pointer(address))
    }

    public override fun toNative(obj: FolderPicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForUser(user: User) = ABI.IFolderPickerStatics_Instance.CreateForUser(user)
  }
}
