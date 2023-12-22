package Windows.Media.PlayTo

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

@ABIMarker(PlayToReceiver.ABI::class)
@Signature("rc(Windows.Media.PlayTo.PlayToReceiver;{ac15cf47-a162-4aa6-af1b-3aa35f3b9069})")
@WinRTByReference(brClass = PlayToReceiver.ByReference::class)
public class PlayToReceiver(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayToReceiver.WithDefault, IWinRTObject {
  private val __371005437_Interface: IPlayToReceiver.WithDefault by lazy {
    as_371005437()
  }


  public override val __371005437_Ptr: JNAPointer? by lazy {
    __371005437_Interface.__371005437_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__371005437_Interface)

  public constructor() : this(ABI.activate())

  private fun as_371005437(): IPlayToReceiver.WithDefault {
    if(pointer == NULL) {
      return(IPlayToReceiver.ABI.makeIPlayToReceiver(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayToReceiver>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayToReceiver.ABI.makeIPlayToReceiver(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PlayToReceiver>
      {
    public override fun getValue() = PlayToReceiver(pointer.getPointer(0))

    public fun setValue(value: PlayToReceiver): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayToReceiver, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.PlayTo.PlayToReceiver".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PlayToReceiver {
      val address = segment.toRawLongValue()
      return PlayToReceiver(Pointer(address))
    }

    public override fun toNative(obj: PlayToReceiver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
