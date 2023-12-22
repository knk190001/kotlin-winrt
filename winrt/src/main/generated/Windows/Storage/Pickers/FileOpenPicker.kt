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

@ABIMarker(FileOpenPicker.ABI::class)
@Signature("rc(Windows.Storage.Pickers.FileOpenPicker;{8ceb6cd2-b446-46f7-b265-90f8e55ad650})")
@WinRTByReference(brClass = FileOpenPicker.ByReference::class)
public class FileOpenPicker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileOpenPicker2.WithDefault, IFileOpenPickerWithOperationId.WithDefault,
    IFileOpenPicker.WithDefault, IFileOpenPicker3.WithDefault, IWinRTObject {
  private val __1794071940_Interface: IFileOpenPicker2.WithDefault by lazy {
    as_1794071940()
  }


  private val __401707238_Interface: IFileOpenPickerWithOperationId.WithDefault by lazy {
    as_401707238()
  }


  private val __57873290_Interface: IFileOpenPicker.WithDefault by lazy {
    as_57873290()
  }


  private val __1794071939_Interface: IFileOpenPicker3.WithDefault by lazy {
    as_1794071939()
  }


  public override val __1794071940_Ptr: JNAPointer? by lazy {
    __1794071940_Interface.__1794071940_Ptr
  }


  public override val __401707238_Ptr: JNAPointer? by lazy {
    __401707238_Interface.__401707238_Ptr
  }


  public override val __57873290_Ptr: JNAPointer? by lazy {
    __57873290_Interface.__57873290_Ptr
  }


  public override val __1794071939_Ptr: JNAPointer? by lazy {
    __1794071939_Interface.__1794071939_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1794071940_Interface, __401707238_Interface, __57873290_Interface,
        __1794071939_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1794071940(): IFileOpenPicker2.WithDefault {
    if(pointer == NULL) {
      return(IFileOpenPicker2.ABI.makeIFileOpenPicker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileOpenPicker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileOpenPicker2.ABI.makeIFileOpenPicker2(ref.value))
  }

  private fun as_401707238(): IFileOpenPickerWithOperationId.WithDefault {
    if(pointer == NULL) {
      return(IFileOpenPickerWithOperationId.ABI.makeIFileOpenPickerWithOperationId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileOpenPickerWithOperationId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileOpenPickerWithOperationId.ABI.makeIFileOpenPickerWithOperationId(ref.value))
  }

  private fun as_57873290(): IFileOpenPicker.WithDefault {
    if(pointer == NULL) {
      return(IFileOpenPicker.ABI.makeIFileOpenPicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileOpenPicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileOpenPicker.ABI.makeIFileOpenPicker(ref.value))
  }

  private fun as_1794071939(): IFileOpenPicker3.WithDefault {
    if(pointer == NULL) {
      return(IFileOpenPicker3.ABI.makeIFileOpenPicker3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileOpenPicker3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileOpenPicker3.ABI.makeIFileOpenPicker3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FileOpenPicker>
      {
    public override fun getValue() = FileOpenPicker(pointer.getPointer(0))

    public fun setValue(value: FileOpenPicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileOpenPicker, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IFileOpenPickerStatics_Instance: IFileOpenPickerStatics by lazy {
      createIFileOpenPickerStatics()
    }


    public val IFileOpenPickerStatics2_Instance: IFileOpenPickerStatics2 by lazy {
      createIFileOpenPickerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Storage.Pickers.FileOpenPicker".toHandle(),
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

    public fun createIFileOpenPickerStatics(): IFileOpenPickerStatics {
      val refiid = Guid.REFIID(IFileOpenPickerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Pickers.FileOpenPicker".toHandle(),refiid,interfacePtr)
      val result = IFileOpenPickerStatics.ABI.makeIFileOpenPickerStatics(interfacePtr.value)
      return result
    }

    public fun createIFileOpenPickerStatics2(): IFileOpenPickerStatics2 {
      val refiid = Guid.REFIID(IFileOpenPickerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Pickers.FileOpenPicker".toHandle(),refiid,interfacePtr)
      val result = IFileOpenPickerStatics2.ABI.makeIFileOpenPickerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FileOpenPicker {
      val address = segment.toRawLongValue()
      return FileOpenPicker(Pointer(address))
    }

    public override fun toNative(obj: FileOpenPicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ResumePickSingleFileAsync() =
        ABI.IFileOpenPickerStatics_Instance.ResumePickSingleFileAsync()

    public fun CreateForUser(user: User) = ABI.IFileOpenPickerStatics2_Instance.CreateForUser(user)
  }
}
