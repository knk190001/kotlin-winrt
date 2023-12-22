package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTaskRegistrationGroupFactory.ABI.IID
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

@ABIMarker(BackgroundTaskRegistrationGroup.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.BackgroundTaskRegistrationGroup;{2ab1919a-871b-4167-8a76-055cd67b5b23})")
@WinRTByReference(brClass = BackgroundTaskRegistrationGroup.ByReference::class)
public class BackgroundTaskRegistrationGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTaskRegistrationGroup.WithDefault, IWinRTObject {
  private val __1558434398_Interface: IBackgroundTaskRegistrationGroup.WithDefault by lazy {
    as_1558434398()
  }


  public override val __1558434398_Ptr: JNAPointer? by lazy {
    __1558434398_Interface.__1558434398_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1558434398_Interface)

  public constructor(id: String) : this(ABI.activate(id))

  public constructor(id: String, name: String) : this(ABI.activate(id, name))

  private fun as_1558434398(): IBackgroundTaskRegistrationGroup.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskRegistrationGroup.ABI.makeIBackgroundTaskRegistrationGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskRegistrationGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskRegistrationGroup.ABI.makeIBackgroundTaskRegistrationGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundTaskRegistrationGroup> {
    public override fun getValue() = BackgroundTaskRegistrationGroup(pointer.getPointer(0))

    public fun setValue(value: BackgroundTaskRegistrationGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundTaskRegistrationGroup, MemoryAddress> {
    public val IBackgroundTaskRegistrationGroupFactory_Instance:
        IBackgroundTaskRegistrationGroupFactory by lazy {
      createIBackgroundTaskRegistrationGroupFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBackgroundTaskRegistrationGroupFactory():
        IBackgroundTaskRegistrationGroupFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.BackgroundTaskRegistrationGroup".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBackgroundTaskRegistrationGroupFactory.ABI.makeIBackgroundTaskRegistrationGroupFactory(factoryActivatorPtr.value))
    }

    public fun activate(id: String): JNAPointer? =
        IBackgroundTaskRegistrationGroupFactory_Instance.Create(id)?.pointer

    public fun activate(id: String, name: String): JNAPointer? =
        IBackgroundTaskRegistrationGroupFactory_Instance.CreateWithName(id, name)?.pointer

    public override fun fromNative(segment: MemoryAddress): BackgroundTaskRegistrationGroup {
      val address = segment.toRawLongValue()
      return BackgroundTaskRegistrationGroup(Pointer(address))
    }

    public override fun toNative(obj: BackgroundTaskRegistrationGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
