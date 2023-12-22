package Windows.UI.Xaml.Input

import Windows.UI.Xaml.RoutedEventArgs
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

@ABIMarker(ContextRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.ContextRequestedEventArgs;{42618e0a-1cb6-46fb-8374-0aec68aa5e51})")
@WinRTByReference(brClass = ContextRequestedEventArgs.ByReference::class)
public class ContextRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IContextRequestedEventArgs.WithDefault, IWinRTObject {
  private val __357467966_Interface: IContextRequestedEventArgs.WithDefault by lazy {
    as_357467966()
  }


  public override val __357467966_Ptr: JNAPointer? by lazy {
    __357467966_Interface.__357467966_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__357467966_Interface)

  public constructor() : this(ABI.activate())

  private fun as_357467966(): IContextRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContextRequestedEventArgs.ABI.makeIContextRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContextRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContextRequestedEventArgs.ABI.makeIContextRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContextRequestedEventArgs> {
    public override fun getValue() = ContextRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContextRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContextRequestedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.ContextRequestedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ContextRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ContextRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContextRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
