package Windows.UI.Xaml.Data

import Windows.UI.Xaml.Data.IRelativeSourceFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(RelativeSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Data.RelativeSource;{2397ce84-2822-483a-b499-d0f031e06c6b})")
@WinRTByReference(brClass = RelativeSource.ByReference::class)
public open class RelativeSource(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IRelativeSource.WithDefault, IWinRTObject {
  private val __2012163631_Interface: IRelativeSource.WithDefault by lazy {
    as_2012163631()
  }


  public override val __2012163631_Ptr: JNAPointer? by lazy {
    __2012163631_Interface.__2012163631_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2012163631_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2012163631(): IRelativeSource.WithDefault {
    if(pointer == NULL) {
      return(IRelativeSource.ABI.makeIRelativeSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRelativeSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRelativeSource.ABI.makeIRelativeSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RelativeSource>
      {
    public override fun getValue() = RelativeSource(pointer.getPointer(0))

    public fun setValue(value: RelativeSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RelativeSource, MemoryAddress> {
    public val IRelativeSourceFactory_Instance: IRelativeSourceFactory by lazy {
      createIRelativeSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRelativeSourceFactory(): IRelativeSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Data.RelativeSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRelativeSourceFactory.ABI.makeIRelativeSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRelativeSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RelativeSource {
      val address = segment.toRawLongValue()
      return RelativeSource(Pointer(address))
    }

    public override fun toNative(obj: RelativeSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
