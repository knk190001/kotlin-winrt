package Windows.ApplicationModel.VoiceCommands

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

@ABIMarker(VoiceCommandContentTile.ABI::class)
@Signature("rc(Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile;{3eefe9f0-b8c7-4c76-a0de-1607895ee327})")
@WinRTByReference(brClass = VoiceCommandContentTile.ByReference::class)
public class VoiceCommandContentTile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoiceCommandContentTile.WithDefault, IWinRTObject {
  private val __1335334421_Interface: IVoiceCommandContentTile.WithDefault by lazy {
    as_1335334421()
  }


  public override val __1335334421_Ptr: JNAPointer? by lazy {
    __1335334421_Interface.__1335334421_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1335334421_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1335334421(): IVoiceCommandContentTile.WithDefault {
    if(pointer == NULL) {
      return(IVoiceCommandContentTile.ABI.makeIVoiceCommandContentTile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoiceCommandContentTile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoiceCommandContentTile.ABI.makeIVoiceCommandContentTile(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceCommandContentTile> {
    public override fun getValue() = VoiceCommandContentTile(pointer.getPointer(0))

    public fun setValue(value: VoiceCommandContentTile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommandContentTile, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): VoiceCommandContentTile {
      val address = segment.toRawLongValue()
      return VoiceCommandContentTile(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommandContentTile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
