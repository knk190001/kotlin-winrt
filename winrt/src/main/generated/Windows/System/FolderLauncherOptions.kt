package Windows.System

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

@ABIMarker(FolderLauncherOptions.ABI::class)
@Signature("rc(Windows.System.FolderLauncherOptions;{bb91c27d-6b87-432a-bd04-776c6f5fb2ab})")
@WinRTByReference(brClass = FolderLauncherOptions.ByReference::class)
public class FolderLauncherOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFolderLauncherOptions.WithDefault, ILauncherViewOptions.WithDefault,
    IWinRTObject {
  private val __749154175_Interface: IFolderLauncherOptions.WithDefault by lazy {
    as_749154175()
  }


  private val __432697174_Interface: ILauncherViewOptions.WithDefault by lazy {
    as_432697174()
  }


  public override val __749154175_Ptr: JNAPointer? by lazy {
    __749154175_Interface.__749154175_Ptr
  }


  public override val __432697174_Ptr: JNAPointer? by lazy {
    __432697174_Interface.__432697174_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__749154175_Interface, __432697174_Interface)

  public constructor() : this(ABI.activate())

  private fun as_749154175(): IFolderLauncherOptions.WithDefault {
    if(pointer == NULL) {
      return(IFolderLauncherOptions.ABI.makeIFolderLauncherOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFolderLauncherOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFolderLauncherOptions.ABI.makeIFolderLauncherOptions(ref.value))
  }

  private fun as_432697174(): ILauncherViewOptions.WithDefault {
    if(pointer == NULL) {
      return(ILauncherViewOptions.ABI.makeILauncherViewOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILauncherViewOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILauncherViewOptions.ABI.makeILauncherViewOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FolderLauncherOptions> {
    public override fun getValue() = FolderLauncherOptions(pointer.getPointer(0))

    public fun setValue(value: FolderLauncherOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FolderLauncherOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.System.FolderLauncherOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): FolderLauncherOptions {
      val address = segment.toRawLongValue()
      return FolderLauncherOptions(Pointer(address))
    }

    public override fun toNative(obj: FolderLauncherOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
