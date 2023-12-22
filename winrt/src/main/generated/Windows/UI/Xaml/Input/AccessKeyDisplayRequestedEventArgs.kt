package Windows.UI.Xaml.Input

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

@ABIMarker(AccessKeyDisplayRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.AccessKeyDisplayRequestedEventArgs;{0c079e55-13fe-4d03-a61d-e12f06567286})")
@WinRTByReference(brClass = AccessKeyDisplayRequestedEventArgs.ByReference::class)
public class AccessKeyDisplayRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccessKeyDisplayRequestedEventArgs.WithDefault, IWinRTObject {
  private val __248880742_Interface: IAccessKeyDisplayRequestedEventArgs.WithDefault by lazy {
    as_248880742()
  }


  public override val __248880742_Ptr: JNAPointer? by lazy {
    __248880742_Interface.__248880742_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__248880742_Interface)

  public constructor() : this(ABI.activate())

  private fun as_248880742(): IAccessKeyDisplayRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAccessKeyDisplayRequestedEventArgs.ABI.makeIAccessKeyDisplayRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccessKeyDisplayRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccessKeyDisplayRequestedEventArgs.ABI.makeIAccessKeyDisplayRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccessKeyDisplayRequestedEventArgs> {
    public override fun getValue() = AccessKeyDisplayRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AccessKeyDisplayRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccessKeyDisplayRequestedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.AccessKeyDisplayRequestedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): AccessKeyDisplayRequestedEventArgs {
      val address = segment.toRawLongValue()
      return AccessKeyDisplayRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AccessKeyDisplayRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
