package Microsoft.UI.Xaml.Input

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

@ABIMarker(AccessKeyDisplayDismissedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.AccessKeyDisplayDismissedEventArgs;{125a83d8-7f86-5ea9-9063-b9407e644587})")
@WinRTByReference(brClass = AccessKeyDisplayDismissedEventArgs.ByReference::class)
public class AccessKeyDisplayDismissedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccessKeyDisplayDismissedEventArgs.WithDefault, IWinRTObject {
  private val __722713728_Interface: IAccessKeyDisplayDismissedEventArgs.WithDefault by lazy {
    as_722713728()
  }


  public override val __722713728_Ptr: JNAPointer? by lazy {
    __722713728_Interface.__722713728_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__722713728_Interface)

  public constructor() : this(ABI.activate())

  private fun as_722713728(): IAccessKeyDisplayDismissedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAccessKeyDisplayDismissedEventArgs.ABI.makeIAccessKeyDisplayDismissedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccessKeyDisplayDismissedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccessKeyDisplayDismissedEventArgs.ABI.makeIAccessKeyDisplayDismissedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccessKeyDisplayDismissedEventArgs> {
    public override fun getValue() = AccessKeyDisplayDismissedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AccessKeyDisplayDismissedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccessKeyDisplayDismissedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.AccessKeyDisplayDismissedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): AccessKeyDisplayDismissedEventArgs {
      val address = segment.toRawLongValue()
      return AccessKeyDisplayDismissedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AccessKeyDisplayDismissedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
