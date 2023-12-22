package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ISymbolIconSourceFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SymbolIconSource.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.SymbolIconSource;{45120d6b-e868-59f2-a30a-b1915ce374bd})")
@WinRTByReference(brClass = SymbolIconSource.ByReference::class)
public open class SymbolIconSource(
  ptr: JNAPointer? = NULL
) : IconSource(ptr), ISymbolIconSource.WithDefault, IWinRTObject {
  private val __710681971_Interface: ISymbolIconSource.WithDefault by lazy {
    as_710681971()
  }


  public override val __710681971_Ptr: JNAPointer? by lazy {
    __710681971_Interface.__710681971_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__710681971_Interface)

  public constructor() : this(ABI.activate())

  private fun as_710681971(): ISymbolIconSource.WithDefault {
    if(pointer == NULL) {
      return(ISymbolIconSource.ABI.makeISymbolIconSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISymbolIconSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISymbolIconSource.ABI.makeISymbolIconSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SymbolIconSource> {
    public override fun getValue() = SymbolIconSource(pointer.getPointer(0))

    public fun setValue(value: SymbolIconSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SymbolIconSource, MemoryAddress> {
    public val ISymbolIconSourceStatics_Instance: ISymbolIconSourceStatics by lazy {
      createISymbolIconSourceStatics()
    }


    public val ISymbolIconSourceFactory_Instance: ISymbolIconSourceFactory by lazy {
      createISymbolIconSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISymbolIconSourceStatics(): ISymbolIconSourceStatics {
      val refiid = Guid.REFIID(ISymbolIconSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SymbolIconSource".toHandle(),refiid,interfacePtr)
      val result = ISymbolIconSourceStatics.ABI.makeISymbolIconSourceStatics(interfacePtr.value)
      return result
    }

    public fun createISymbolIconSourceFactory(): ISymbolIconSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SymbolIconSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISymbolIconSourceFactory.ABI.makeISymbolIconSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISymbolIconSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SymbolIconSource {
      val address = segment.toRawLongValue()
      return SymbolIconSource(Pointer(address))
    }

    public override fun toNative(obj: SymbolIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SymbolProperty() = ABI.ISymbolIconSourceStatics_Instance.get_SymbolProperty()
  }
}
