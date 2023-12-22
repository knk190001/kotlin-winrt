package Windows.UI.Xaml

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

@ABIMarker(FrameworkViewSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.FrameworkViewSource;{e3b077da-35ad-4b09-b5b2-27420041ba9f})")
@WinRTByReference(brClass = FrameworkViewSource.ByReference::class)
public class FrameworkViewSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameworkViewSource.WithDefault,
    Windows.ApplicationModel.Core.IFrameworkViewSource.WithDefault, IWinRTObject {
  private val __539380780_Interface: IFrameworkViewSource.WithDefault by lazy {
    as_539380780()
  }


  private val __422737506_Interface: Windows.ApplicationModel.Core.IFrameworkViewSource.WithDefault
      by lazy {
    as_422737506()
  }


  public override val __539380780_Ptr: JNAPointer? by lazy {
    __539380780_Interface.__539380780_Ptr
  }


  public override val __422737506_Ptr: JNAPointer? by lazy {
    __422737506_Interface.__422737506_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__539380780_Interface, __422737506_Interface)

  public constructor() : this(ABI.activate())

  private fun as_539380780(): IFrameworkViewSource.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkViewSource.ABI.makeIFrameworkViewSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkViewSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkViewSource.ABI.makeIFrameworkViewSource(ref.value))
  }

  private fun as_422737506(): Windows.ApplicationModel.Core.IFrameworkViewSource.WithDefault {
    if(pointer == NULL) {
      return(Windows.ApplicationModel.Core.IFrameworkViewSource.ABI.makeIFrameworkViewSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<Windows.ApplicationModel.Core.IFrameworkViewSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(Windows.ApplicationModel.Core.IFrameworkViewSource.ABI.makeIFrameworkViewSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameworkViewSource> {
    public override fun getValue() = FrameworkViewSource(pointer.getPointer(0))

    public fun setValue(value: FrameworkViewSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameworkViewSource, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.FrameworkViewSource".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): FrameworkViewSource {
      val address = segment.toRawLongValue()
      return FrameworkViewSource(Pointer(address))
    }

    public override fun toNative(obj: FrameworkViewSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
