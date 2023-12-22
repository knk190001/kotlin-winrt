package Windows.Media.Protection

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

@ABIMarker(MediaProtectionManager.ABI::class)
@Signature("rc(Windows.Media.Protection.MediaProtectionManager;{45694947-c741-434b-a79e-474c12d93d2f})")
@WinRTByReference(brClass = MediaProtectionManager.ByReference::class)
public class MediaProtectionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaProtectionManager.WithDefault, IWinRTObject {
  private val __1607533717_Interface: IMediaProtectionManager.WithDefault by lazy {
    as_1607533717()
  }


  public override val __1607533717_Ptr: JNAPointer? by lazy {
    __1607533717_Interface.__1607533717_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1607533717_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1607533717(): IMediaProtectionManager.WithDefault {
    if(pointer == NULL) {
      return(IMediaProtectionManager.ABI.makeIMediaProtectionManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaProtectionManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaProtectionManager.ABI.makeIMediaProtectionManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaProtectionManager> {
    public override fun getValue() = MediaProtectionManager(pointer.getPointer(0))

    public fun setValue(value: MediaProtectionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaProtectionManager, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.MediaProtectionManager".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MediaProtectionManager {
      val address = segment.toRawLongValue()
      return MediaProtectionManager(Pointer(address))
    }

    public override fun toNative(obj: MediaProtectionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
