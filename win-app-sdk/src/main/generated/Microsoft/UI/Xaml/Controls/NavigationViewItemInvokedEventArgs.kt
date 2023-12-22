package Microsoft.UI.Xaml.Controls

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

@ABIMarker(NavigationViewItemInvokedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.NavigationViewItemInvokedEventArgs;{074cebaa-5d05-547b-8cd6-d19ac2d9bb3b})")
@WinRTByReference(brClass = NavigationViewItemInvokedEventArgs.ByReference::class)
public class NavigationViewItemInvokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INavigationViewItemInvokedEventArgs.WithDefault,
    INavigationViewItemInvokedEventArgs2.WithDefault, IWinRTObject {
  private val __139138370_Interface: INavigationViewItemInvokedEventArgs.WithDefault by lazy {
    as_139138370()
  }


  private val __18322124_Interface: INavigationViewItemInvokedEventArgs2.WithDefault by lazy {
    as_18322124()
  }


  public override val __139138370_Ptr: JNAPointer? by lazy {
    __139138370_Interface.__139138370_Ptr
  }


  public override val __18322124_Ptr: JNAPointer? by lazy {
    __18322124_Interface.__18322124_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__139138370_Interface, __18322124_Interface)

  public constructor() : this(ABI.activate())

  private fun as_139138370(): INavigationViewItemInvokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemInvokedEventArgs.ABI.makeINavigationViewItemInvokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemInvokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemInvokedEventArgs.ABI.makeINavigationViewItemInvokedEventArgs(ref.value))
  }

  private fun as_18322124(): INavigationViewItemInvokedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemInvokedEventArgs2.ABI.makeINavigationViewItemInvokedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemInvokedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemInvokedEventArgs2.ABI.makeINavigationViewItemInvokedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewItemInvokedEventArgs> {
    public override fun getValue() = NavigationViewItemInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: NavigationViewItemInvokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewItemInvokedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.NavigationViewItemInvokedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): NavigationViewItemInvokedEventArgs {
      val address = segment.toRawLongValue()
      return NavigationViewItemInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewItemInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
