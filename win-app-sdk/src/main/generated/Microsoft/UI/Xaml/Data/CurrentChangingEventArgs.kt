package Microsoft.UI.Xaml.Data

import Microsoft.UI.Xaml.Data.ICurrentChangingEventArgsFactory.ABI.IID
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CurrentChangingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Data.CurrentChangingEventArgs;{63e42ed6-e14a-51ea-9cb1-72f9c907dc80})")
@WinRTByReference(brClass = CurrentChangingEventArgs.ByReference::class)
public open class CurrentChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICurrentChangingEventArgs.WithDefault, IWinRTObject {
  private val __1121888388_Interface: ICurrentChangingEventArgs.WithDefault by lazy {
    as_1121888388()
  }


  public override val __1121888388_Ptr: JNAPointer? by lazy {
    __1121888388_Interface.__1121888388_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1121888388_Interface)

  public constructor() : this(ABI.activate())

  public constructor(isCancelable: Boolean) : this(ABI.activate(isCancelable))

  private fun as_1121888388(): ICurrentChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICurrentChangingEventArgs.ABI.makeICurrentChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICurrentChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICurrentChangingEventArgs.ABI.makeICurrentChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CurrentChangingEventArgs> {
    public override fun getValue() = CurrentChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: CurrentChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CurrentChangingEventArgs, MemoryAddress> {
    public val ICurrentChangingEventArgsFactory_Instance: ICurrentChangingEventArgsFactory by lazy {
      createICurrentChangingEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICurrentChangingEventArgsFactory(): ICurrentChangingEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Data.CurrentChangingEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICurrentChangingEventArgsFactory.ABI.makeICurrentChangingEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        ICurrentChangingEventArgsFactory_Instance.CreateInstance(null, null)?.pointer

    public fun activate(isCancelable: Boolean): JNAPointer? =
        ICurrentChangingEventArgsFactory_Instance.CreateWithCancelableParameter(isCancelable, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CurrentChangingEventArgs {
      val address = segment.toRawLongValue()
      return CurrentChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CurrentChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
