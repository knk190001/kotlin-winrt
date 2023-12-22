package Windows.Media.Protection.PlayReady

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
import kotlin.reflect.typeOf

@ABIMarker(PlayReadyLicense.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.PlayReadyLicense;{ee474c4e-fa3c-414d-a9f2-3ffc1ef832d4})")
@WinRTByReference(brClass = PlayReadyLicense.ByReference::class)
public class PlayReadyLicense(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayReadyLicense.WithDefault, IPlayReadyLicense2.WithDefault, IWinRTObject {
  private val __558397548_Interface: IPlayReadyLicense.WithDefault by lazy {
    as_558397548()
  }


  private val __130454854_Interface: IPlayReadyLicense2.WithDefault by lazy {
    as_130454854()
  }


  public override val __558397548_Ptr: JNAPointer? by lazy {
    __558397548_Interface.__558397548_Ptr
  }


  public override val __130454854_Ptr: JNAPointer? by lazy {
    __130454854_Interface.__130454854_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__558397548_Interface, __130454854_Interface)

  private fun as_558397548(): IPlayReadyLicense.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadyLicense.ABI.makeIPlayReadyLicense(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadyLicense>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadyLicense.ABI.makeIPlayReadyLicense(ref.value))
  }

  private fun as_130454854(): IPlayReadyLicense2.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadyLicense2.ABI.makeIPlayReadyLicense2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadyLicense2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadyLicense2.ABI.makeIPlayReadyLicense2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadyLicense> {
    public override fun getValue() = PlayReadyLicense(pointer.getPointer(0))

    public fun setValue(value: PlayReadyLicense): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadyLicense, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlayReadyLicense {
      val address = segment.toRawLongValue()
      return PlayReadyLicense(Pointer(address))
    }

    public override fun toNative(obj: PlayReadyLicense): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
