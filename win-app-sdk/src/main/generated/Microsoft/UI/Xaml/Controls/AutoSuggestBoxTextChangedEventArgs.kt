package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyObject
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AutoSuggestBoxTextChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AutoSuggestBoxTextChangedEventArgs;{d7191d84-e886-547f-a3e2-12f0e05b20fa})")
@WinRTByReference(brClass = AutoSuggestBoxTextChangedEventArgs.ByReference::class)
public class AutoSuggestBoxTextChangedEventArgs(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IAutoSuggestBoxTextChangedEventArgs.WithDefault, IWinRTObject {
  private val __1658137965_Interface: IAutoSuggestBoxTextChangedEventArgs.WithDefault by lazy {
    as_1658137965()
  }


  public override val __1658137965_Ptr: JNAPointer? by lazy {
    __1658137965_Interface.__1658137965_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1658137965_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1658137965(): IAutoSuggestBoxTextChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAutoSuggestBoxTextChangedEventArgs.ABI.makeIAutoSuggestBoxTextChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutoSuggestBoxTextChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutoSuggestBoxTextChangedEventArgs.ABI.makeIAutoSuggestBoxTextChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutoSuggestBoxTextChangedEventArgs> {
    public override fun getValue() = AutoSuggestBoxTextChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AutoSuggestBoxTextChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutoSuggestBoxTextChangedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAutoSuggestBoxTextChangedEventArgsStatics_Instance:
        IAutoSuggestBoxTextChangedEventArgsStatics by lazy {
      createIAutoSuggestBoxTextChangedEventArgsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AutoSuggestBoxTextChangedEventArgs".toHandle(),
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

    public fun createIAutoSuggestBoxTextChangedEventArgsStatics():
        IAutoSuggestBoxTextChangedEventArgsStatics {
      val refiid = Guid.REFIID(IAutoSuggestBoxTextChangedEventArgsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AutoSuggestBoxTextChangedEventArgs".toHandle(),refiid,interfacePtr)
      val result =
          IAutoSuggestBoxTextChangedEventArgsStatics.ABI.makeIAutoSuggestBoxTextChangedEventArgsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AutoSuggestBoxTextChangedEventArgs {
      val address = segment.toRawLongValue()
      return AutoSuggestBoxTextChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AutoSuggestBoxTextChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ReasonProperty() =
        ABI.IAutoSuggestBoxTextChangedEventArgsStatics_Instance.get_ReasonProperty()
  }
}
