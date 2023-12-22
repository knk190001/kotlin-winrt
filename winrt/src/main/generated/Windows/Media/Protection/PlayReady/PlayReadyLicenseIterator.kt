package Windows.Media.Protection.PlayReady

import Windows.Foundation.Collections.IIterator
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
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(PlayReadyLicenseIterator.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.PlayReadyLicenseIterator;pinterface({6a79e863-4300-459a-9966-cbb660963ee1};{ee474c4e-fa3c-414d-a9f2-3ffc1ef832d4}))")
@WinRTByReference(brClass = PlayReadyLicenseIterator.ByReference::class)
public class PlayReadyLicenseIterator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIterator<IPlayReadyLicense?>, IWinRTObject {
  private val __1449660594_Interface: IIterator<IPlayReadyLicense?> by lazy {
    as_1449660594()
  }


  public override val __1449660594_Type: KType = typeOf<IIterator<IPlayReadyLicense?>>()

  public override val __1449660594_Ptr: JNAPointer? by lazy {
    __1449660594_Interface.__1449660594_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1449660594_Interface)

  private fun as_1449660594(): IIterator<IPlayReadyLicense?> {
    if(pointer == NULL) {
      return(IIterator.ABI.makeIIterator<IPlayReadyLicense?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterator<IPlayReadyLicense?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterator.ABI.makeIIterator<IPlayReadyLicense?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadyLicenseIterator> {
    public override fun getValue() = PlayReadyLicenseIterator(pointer.getPointer(0))

    public fun setValue(value: PlayReadyLicenseIterator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadyLicenseIterator, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlayReadyLicenseIterator {
      val address = segment.toRawLongValue()
      return PlayReadyLicenseIterator(Pointer(address))
    }

    public override fun toNative(obj: PlayReadyLicenseIterator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
