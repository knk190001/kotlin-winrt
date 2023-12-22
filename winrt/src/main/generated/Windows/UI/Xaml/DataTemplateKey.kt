package Windows.UI.Xaml

import Windows.UI.Xaml.IDataTemplateKeyFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(DataTemplateKey.ABI::class)
@Signature("rc(Windows.UI.Xaml.DataTemplateKey;{873b6c28-cceb-4b61-86fa-b2cec39cc2fa})")
@WinRTByReference(brClass = DataTemplateKey.ByReference::class)
public open class DataTemplateKey(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataTemplateKey.WithDefault, IWinRTObject {
  private val __1382415127_Interface: IDataTemplateKey.WithDefault by lazy {
    as_1382415127()
  }


  public override val __1382415127_Ptr: JNAPointer? by lazy {
    __1382415127_Interface.__1382415127_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1382415127_Interface)

  public constructor() : this(ABI.activate())

  public constructor(dataType: IUnknown) : this(ABI.activate(dataType))

  private fun as_1382415127(): IDataTemplateKey.WithDefault {
    if(pointer == NULL) {
      return(IDataTemplateKey.ABI.makeIDataTemplateKey(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataTemplateKey>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataTemplateKey.ABI.makeIDataTemplateKey(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataTemplateKey> {
    public override fun getValue() = DataTemplateKey(pointer.getPointer(0))

    public fun setValue(value: DataTemplateKey): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataTemplateKey, MemoryAddress> {
    public val IDataTemplateKeyFactory_Instance: IDataTemplateKeyFactory by lazy {
      createIDataTemplateKeyFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDataTemplateKeyFactory(): IDataTemplateKeyFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.DataTemplateKey".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDataTemplateKeyFactory.ABI.makeIDataTemplateKeyFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IDataTemplateKeyFactory_Instance.CreateInstance(null,
        null)?.pointer

    public fun activate(dataType: IUnknown): JNAPointer? =
        IDataTemplateKeyFactory_Instance.CreateInstanceWithType(dataType, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DataTemplateKey {
      val address = segment.toRawLongValue()
      return DataTemplateKey(Pointer(address))
    }

    public override fun toNative(obj: DataTemplateKey): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
