package Windows.UI.Core

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreWindowDialog.ABI::class)
@Signature("rc(Windows.UI.Core.CoreWindowDialog;{e7392ce0-c78d-427e-8b2c-01ff420c69d5})")
@WinRTByReference(brClass = CoreWindowDialog.ByReference::class)
public class CoreWindowDialog(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWindowDialog.WithDefault, IWinRTObject {
  private val __680251506_Interface: ICoreWindowDialog.WithDefault by lazy {
    as_680251506()
  }


  public override val __680251506_Ptr: JNAPointer? by lazy {
    __680251506_Interface.__680251506_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__680251506_Interface)

  public constructor() : this(ABI.activate())

  public constructor(title: String) : this(ABI.activate(title))

  private fun as_680251506(): ICoreWindowDialog.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindowDialog.ABI.makeICoreWindowDialog(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindowDialog>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindowDialog.ABI.makeICoreWindowDialog(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWindowDialog> {
    public override fun getValue() = CoreWindowDialog(pointer.getPointer(0))

    public fun setValue(value: CoreWindowDialog): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWindowDialog, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICoreWindowDialogFactory_Instance: ICoreWindowDialogFactory by lazy {
      createICoreWindowDialogFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Core.CoreWindowDialog".toHandle(),
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

    public fun createICoreWindowDialogFactory(): ICoreWindowDialogFactory {
      val refiid = Guid.REFIID(ICoreWindowDialogFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Core.CoreWindowDialog".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICoreWindowDialogFactory.ABI.makeICoreWindowDialogFactory(factoryActivatorPtr.value))
    }

    public fun activate(title: String): JNAPointer? =
        ICoreWindowDialogFactory_Instance.CreateWithTitle(title)?.pointer

    public override fun fromNative(segment: MemoryAddress): CoreWindowDialog {
      val address = segment.toRawLongValue()
      return CoreWindowDialog(Pointer(address))
    }

    public override fun toNative(obj: CoreWindowDialog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
