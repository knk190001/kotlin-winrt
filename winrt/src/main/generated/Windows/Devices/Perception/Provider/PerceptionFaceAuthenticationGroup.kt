package Windows.Devices.Perception.Provider

import Windows.Devices.Perception.Provider.IPerceptionFaceAuthenticationGroupFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
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

@ABIMarker(PerceptionFaceAuthenticationGroup.ABI::class)
@Signature("rc(Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup;{e8019814-4a91-41b0-83a6-881a1775353e})")
@WinRTByReference(brClass = PerceptionFaceAuthenticationGroup.ByReference::class)
public class PerceptionFaceAuthenticationGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionFaceAuthenticationGroup.WithDefault, IWinRTObject {
  private val __802293114_Interface: IPerceptionFaceAuthenticationGroup.WithDefault by lazy {
    as_802293114()
  }


  public override val __802293114_Ptr: JNAPointer? by lazy {
    __802293114_Interface.__802293114_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__802293114_Interface)

  public constructor(
    ids: IIterable<String?>,
    startHandler: PerceptionStartFaceAuthenticationHandler,
    stopHandler: PerceptionStopFaceAuthenticationHandler
  ) : this(ABI.activate(ids, startHandler, stopHandler))

  private fun as_802293114(): IPerceptionFaceAuthenticationGroup.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionFaceAuthenticationGroup.ABI.makeIPerceptionFaceAuthenticationGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionFaceAuthenticationGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionFaceAuthenticationGroup.ABI.makeIPerceptionFaceAuthenticationGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionFaceAuthenticationGroup> {
    public override fun getValue() = PerceptionFaceAuthenticationGroup(pointer.getPointer(0))

    public fun setValue(value: PerceptionFaceAuthenticationGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionFaceAuthenticationGroup, MemoryAddress> {
    public val IPerceptionFaceAuthenticationGroupFactory_Instance:
        IPerceptionFaceAuthenticationGroupFactory by lazy {
      createIPerceptionFaceAuthenticationGroupFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPerceptionFaceAuthenticationGroupFactory():
        IPerceptionFaceAuthenticationGroupFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPerceptionFaceAuthenticationGroupFactory.ABI.makeIPerceptionFaceAuthenticationGroupFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      ids: IIterable<String?>,
      startHandler: PerceptionStartFaceAuthenticationHandler,
      stopHandler: PerceptionStopFaceAuthenticationHandler
    ): JNAPointer? = IPerceptionFaceAuthenticationGroupFactory_Instance.Create(ids, startHandler,
        stopHandler)?.pointer

    public override fun fromNative(segment: MemoryAddress): PerceptionFaceAuthenticationGroup {
      val address = segment.toRawLongValue()
      return PerceptionFaceAuthenticationGroup(Pointer(address))
    }

    public override fun toNative(obj: PerceptionFaceAuthenticationGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
