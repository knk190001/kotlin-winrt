package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(ClipboardContentOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.ClipboardContentOptions;{e888a98c-ad4b-5447-a056-ab3556276d2b})")
@WinRTByReference(brClass = ClipboardContentOptions.ByReference::class)
public class ClipboardContentOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClipboardContentOptions.WithDefault, IWinRTObject {
  private val __469138671_Interface: IClipboardContentOptions.WithDefault by lazy {
    as_469138671()
  }


  public override val __469138671_Ptr: JNAPointer? by lazy {
    __469138671_Interface.__469138671_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__469138671_Interface)

  public constructor() : this(ABI.activate())

  private fun as_469138671(): IClipboardContentOptions.WithDefault {
    if(pointer == NULL) {
      return(IClipboardContentOptions.ABI.makeIClipboardContentOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClipboardContentOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClipboardContentOptions.ABI.makeIClipboardContentOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClipboardContentOptions> {
    public override fun getValue() = ClipboardContentOptions(pointer.getPointer(0))

    public fun setValue(value: ClipboardContentOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClipboardContentOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.ClipboardContentOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ClipboardContentOptions {
      val address = segment.toRawLongValue()
      return ClipboardContentOptions(Pointer(address))
    }

    public override fun toNative(obj: ClipboardContentOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
