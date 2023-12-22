package Windows.Devices.Lights.Effects

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
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
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(LampArrayEffectPlaylist.ABI::class)
@Signature("rc(Windows.Devices.Lights.Effects.LampArrayEffectPlaylist;{7de58bfe-6f61-4103-98c7-d6632f7b9169})")
@WinRTByReference(brClass = LampArrayEffectPlaylist.ByReference::class)
public class LampArrayEffectPlaylist(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILampArrayEffectPlaylist.WithDefault, IVectorView<ILampArrayEffect?>,
    IIterable<ILampArrayEffect?>, IWinRTObject {
  private val __995910184_Interface: ILampArrayEffectPlaylist.WithDefault by lazy {
    as_995910184()
  }


  private val __970637876_Interface: IVectorView<ILampArrayEffect?> by lazy {
    as_970637876()
  }


  private val __1449643190_Interface: IIterable<ILampArrayEffect?> by lazy {
    as_1449643190()
  }


  public override val __970637876_Type: KType = typeOf<IVectorView<ILampArrayEffect?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<ILampArrayEffect?>>()

  public override val __995910184_Ptr: JNAPointer? by lazy {
    __995910184_Interface.__995910184_Ptr
  }


  public override val __970637876_Ptr: JNAPointer? by lazy {
    __970637876_Interface.__970637876_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__995910184_Interface, __970637876_Interface, __1449643190_Interface)

  public constructor() : this(ABI.activate())

  private fun as_995910184(): ILampArrayEffectPlaylist.WithDefault {
    if(pointer == NULL) {
      return(ILampArrayEffectPlaylist.ABI.makeILampArrayEffectPlaylist(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampArrayEffectPlaylist>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampArrayEffectPlaylist.ABI.makeILampArrayEffectPlaylist(ref.value))
  }

  private fun as_970637876(): IVectorView<ILampArrayEffect?> {
    if(pointer == NULL) {
      return(IVectorView.ABI.makeIVectorView<ILampArrayEffect?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVectorView<ILampArrayEffect?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVectorView.ABI.makeIVectorView<ILampArrayEffect?>(ref.value))
  }

  private fun as_1449643190(): IIterable<ILampArrayEffect?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<ILampArrayEffect?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<ILampArrayEffect?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<ILampArrayEffect?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LampArrayEffectPlaylist> {
    public override fun getValue() = LampArrayEffectPlaylist(pointer.getPointer(0))

    public fun setValue(value: LampArrayEffectPlaylist): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LampArrayEffectPlaylist, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ILampArrayEffectPlaylistStatics_Instance: ILampArrayEffectPlaylistStatics by lazy {
      createILampArrayEffectPlaylistStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Lights.Effects.LampArrayEffectPlaylist".toHandle(),
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

    public fun createILampArrayEffectPlaylistStatics(): ILampArrayEffectPlaylistStatics {
      val refiid = Guid.REFIID(ILampArrayEffectPlaylistStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Lights.Effects.LampArrayEffectPlaylist".toHandle(),refiid,interfacePtr)
      val result =
          ILampArrayEffectPlaylistStatics.ABI.makeILampArrayEffectPlaylistStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LampArrayEffectPlaylist {
      val address = segment.toRawLongValue()
      return LampArrayEffectPlaylist(Pointer(address))
    }

    public override fun toNative(obj: LampArrayEffectPlaylist): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun StartAll(value: IIterable<LampArrayEffectPlaylist?>) =
        ABI.ILampArrayEffectPlaylistStatics_Instance.StartAll(value)

    public fun StopAll(value: IIterable<LampArrayEffectPlaylist?>) =
        ABI.ILampArrayEffectPlaylistStatics_Instance.StopAll(value)

    public fun PauseAll(value: IIterable<LampArrayEffectPlaylist?>) =
        ABI.ILampArrayEffectPlaylistStatics_Instance.PauseAll(value)
  }
}
