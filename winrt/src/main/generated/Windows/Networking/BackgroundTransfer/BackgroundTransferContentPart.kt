package Windows.Networking.BackgroundTransfer

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

@ABIMarker(BackgroundTransferContentPart.ABI::class)
@Signature("rc(Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart;{e8e15657-d7d1-4ed8-838e-674ac217ace6})")
@WinRTByReference(brClass = BackgroundTransferContentPart.ByReference::class)
public class BackgroundTransferContentPart(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTransferContentPart.WithDefault, IWinRTObject {
  private val __630085490_Interface: IBackgroundTransferContentPart.WithDefault by lazy {
    as_630085490()
  }


  public override val __630085490_Ptr: JNAPointer? by lazy {
    __630085490_Interface.__630085490_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__630085490_Interface)

  public constructor() : this(ABI.activate())

  public constructor(name: String) : this(ABI.activate(name))

  public constructor(name: String, fileName: String) : this(ABI.activate(name, fileName))

  private fun as_630085490(): IBackgroundTransferContentPart.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTransferContentPart.ABI.makeIBackgroundTransferContentPart(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTransferContentPart>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTransferContentPart.ABI.makeIBackgroundTransferContentPart(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundTransferContentPart> {
    public override fun getValue() = BackgroundTransferContentPart(pointer.getPointer(0))

    public fun setValue(value: BackgroundTransferContentPart): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundTransferContentPart, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBackgroundTransferContentPartFactory_Instance: IBackgroundTransferContentPartFactory
        by lazy {
      createIBackgroundTransferContentPartFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart".toHandle(),
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

    public fun createIBackgroundTransferContentPartFactory():
        IBackgroundTransferContentPartFactory {
      val refiid = Guid.REFIID(IBackgroundTransferContentPartFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBackgroundTransferContentPartFactory.ABI.makeIBackgroundTransferContentPartFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IBackgroundTransferContentPartFactory_Instance.CreateWithName(name)?.pointer

    public fun activate(name: String, fileName: String): JNAPointer? =
        IBackgroundTransferContentPartFactory_Instance.CreateWithNameAndFileName(name,
        fileName)?.pointer

    public override fun fromNative(segment: MemoryAddress): BackgroundTransferContentPart {
      val address = segment.toRawLongValue()
      return BackgroundTransferContentPart(Pointer(address))
    }

    public override fun toNative(obj: BackgroundTransferContentPart): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
