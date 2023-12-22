package Microsoft.UI.Xaml.Data

import Microsoft.UI.Xaml.Data.IDataErrorsChangedEventArgsFactory.ABI.IID
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

@ABIMarker(DataErrorsChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Data.DataErrorsChangedEventArgs;{d026dd64-5f26-5f15-a86a-0dec8a431796})")
@WinRTByReference(brClass = DataErrorsChangedEventArgs.ByReference::class)
public class DataErrorsChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataErrorsChangedEventArgs.WithDefault, IWinRTObject {
  private val __995869781_Interface: IDataErrorsChangedEventArgs.WithDefault by lazy {
    as_995869781()
  }


  public override val __995869781_Ptr: JNAPointer? by lazy {
    __995869781_Interface.__995869781_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__995869781_Interface)

  public constructor(name: String) : this(ABI.activate(name))

  private fun as_995869781(): IDataErrorsChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDataErrorsChangedEventArgs.ABI.makeIDataErrorsChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataErrorsChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataErrorsChangedEventArgs.ABI.makeIDataErrorsChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataErrorsChangedEventArgs> {
    public override fun getValue() = DataErrorsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DataErrorsChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataErrorsChangedEventArgs, MemoryAddress> {
    public val IDataErrorsChangedEventArgsFactory_Instance: IDataErrorsChangedEventArgsFactory by
        lazy {
      createIDataErrorsChangedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDataErrorsChangedEventArgsFactory(): IDataErrorsChangedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Data.DataErrorsChangedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDataErrorsChangedEventArgsFactory.ABI.makeIDataErrorsChangedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IDataErrorsChangedEventArgsFactory_Instance.CreateInstance(name)?.pointer

    public override fun fromNative(segment: MemoryAddress): DataErrorsChangedEventArgs {
      val address = segment.toRawLongValue()
      return DataErrorsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DataErrorsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
