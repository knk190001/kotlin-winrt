package Windows.UI.Xaml

import Windows.UI.Xaml.IRoutedEventArgsFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RoutedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.RoutedEventArgs;{5c985ac6-d802-4b38-a223-bf070c43fedf})")
@WinRTByReference(brClass = RoutedEventArgs.ByReference::class)
public open class RoutedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRoutedEventArgs.WithDefault, IWinRTObject {
  private val __1237115146_Interface: IRoutedEventArgs.WithDefault by lazy {
    as_1237115146()
  }


  public override val __1237115146_Ptr: JNAPointer? by lazy {
    __1237115146_Interface.__1237115146_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1237115146_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1237115146(): IRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRoutedEventArgs.ABI.makeIRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRoutedEventArgs.ABI.makeIRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RoutedEventArgs> {
    public override fun getValue() = RoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RoutedEventArgs, MemoryAddress> {
    public val IRoutedEventArgsFactory_Instance: IRoutedEventArgsFactory by lazy {
      createIRoutedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRoutedEventArgsFactory(): IRoutedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.RoutedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRoutedEventArgsFactory.ABI.makeIRoutedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRoutedEventArgsFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RoutedEventArgs {
      val address = segment.toRawLongValue()
      return RoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
