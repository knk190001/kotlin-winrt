package Windows.UI.Xaml.Hosting

import Windows.Foundation.IClosable
import Windows.UI.Xaml.Hosting.IDesignerAppManagerFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DesignerAppManager.ABI::class)
@Signature("rc(Windows.UI.Xaml.Hosting.DesignerAppManager;{a6272caa-d5c6-40cb-abd9-27ba43831bb7})")
@WinRTByReference(brClass = DesignerAppManager.ByReference::class)
public class DesignerAppManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDesignerAppManager.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1311437891_Interface: IDesignerAppManager.WithDefault by lazy {
    as_1311437891()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1311437891_Ptr: JNAPointer? by lazy {
    __1311437891_Interface.__1311437891_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1311437891_Interface, __1260617006_Interface)

  public constructor(appUserModelId: String) : this(ABI.activate(appUserModelId))

  private fun as_1311437891(): IDesignerAppManager.WithDefault {
    if(pointer == NULL) {
      return(IDesignerAppManager.ABI.makeIDesignerAppManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesignerAppManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesignerAppManager.ABI.makeIDesignerAppManager(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DesignerAppManager> {
    public override fun getValue() = DesignerAppManager(pointer.getPointer(0))

    public fun setValue(value: DesignerAppManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesignerAppManager, MemoryAddress> {
    public val IDesignerAppManagerFactory_Instance: IDesignerAppManagerFactory by lazy {
      createIDesignerAppManagerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDesignerAppManagerFactory(): IDesignerAppManagerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Hosting.DesignerAppManager".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDesignerAppManagerFactory.ABI.makeIDesignerAppManagerFactory(factoryActivatorPtr.value))
    }

    public fun activate(appUserModelId: String): JNAPointer? =
        IDesignerAppManagerFactory_Instance.Create(appUserModelId)?.pointer

    public override fun fromNative(segment: MemoryAddress): DesignerAppManager {
      val address = segment.toRawLongValue()
      return DesignerAppManager(Pointer(address))
    }

    public override fun toNative(obj: DesignerAppManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
