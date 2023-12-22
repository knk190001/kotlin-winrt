package Windows.UI.Xaml.Media

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Media.ICacheModeFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CacheMode.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.CacheMode;{98dc8b11-c6f9-4dab-b838-5fd5ec8c7350})")
@WinRTByReference(brClass = CacheMode.ByReference::class)
public open class CacheMode(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ICacheMode.WithDefault, IWinRTObject {
  private val __2048444983_Interface: ICacheMode.WithDefault by lazy {
    as_2048444983()
  }


  public override val __2048444983_Ptr: JNAPointer? by lazy {
    __2048444983_Interface.__2048444983_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2048444983_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2048444983(): ICacheMode.WithDefault {
    if(pointer == NULL) {
      return(ICacheMode.ABI.makeICacheMode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICacheMode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICacheMode.ABI.makeICacheMode(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CacheMode> {
    public override fun getValue() = CacheMode(pointer.getPointer(0))

    public fun setValue(value: CacheMode): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CacheMode, MemoryAddress> {
    public val ICacheModeFactory_Instance: ICacheModeFactory by lazy {
      createICacheModeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICacheModeFactory(): ICacheModeFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.CacheMode".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICacheModeFactory.ABI.makeICacheModeFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ICacheModeFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CacheMode {
      val address = segment.toRawLongValue()
      return CacheMode(Pointer(address))
    }

    public override fun toNative(obj: CacheMode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
