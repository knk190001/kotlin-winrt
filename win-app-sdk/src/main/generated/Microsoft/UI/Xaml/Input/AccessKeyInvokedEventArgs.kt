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

@ABIMarker(AccessKeyInvokedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.AccessKeyInvokedEventArgs;{d00c11a4-f9fb-5707-9692-98b80bb8546d})")
@WinRTByReference(brClass = AccessKeyInvokedEventArgs.ByReference::class)
public class AccessKeyInvokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccessKeyInvokedEventArgs.WithDefault, IWinRTObject {
  private val __398414555_Interface: IAccessKeyInvokedEventArgs.WithDefault by lazy {
    as_398414555()
  }


  public override val __398414555_Ptr: JNAPointer? by lazy {
    __398414555_Interface.__398414555_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__398414555_Interface)

  public constructor() : this(ABI.activate())

  private fun as_398414555(): IAccessKeyInvokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAccessKeyInvokedEventArgs.ABI.makeIAccessKeyInvokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccessKeyInvokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccessKeyInvokedEventArgs.ABI.makeIAccessKeyInvokedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccessKeyInvokedEventArgs> {
    public override fun getValue() = AccessKeyInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AccessKeyInvokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccessKeyInvokedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.AccessKeyInvokedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): AccessKeyInvokedEventArgs {
      val address = segment.toRawLongValue()
      return AccessKeyInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AccessKeyInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
