package Microsoft.UI.Xaml.Media.Animation

import Windows.Foundation.TimeSpan
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(KeyTimeHelper.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.KeyTimeHelper;{e354da44-1f24-59c6-bc5b-d6b1ba267e9c})")
@WinRTByReference(brClass = KeyTimeHelper.ByReference::class)
public class KeyTimeHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeyTimeHelper.WithDefault, IWinRTObject {
  private val __375704961_Interface: IKeyTimeHelper.WithDefault by lazy {
    as_375704961()
  }


  public override val __375704961_Ptr: JNAPointer? by lazy {
    __375704961_Interface.__375704961_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__375704961_Interface)

  private fun as_375704961(): IKeyTimeHelper.WithDefault {
    if(pointer == NULL) {
      return(IKeyTimeHelper.ABI.makeIKeyTimeHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyTimeHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyTimeHelper.ABI.makeIKeyTimeHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<KeyTimeHelper>
      {
    public override fun getValue() = KeyTimeHelper(pointer.getPointer(0))

    public fun setValue(value: KeyTimeHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyTimeHelper, MemoryAddress> {
    public val IKeyTimeHelperStatics_Instance: IKeyTimeHelperStatics by lazy {
      createIKeyTimeHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKeyTimeHelperStatics(): IKeyTimeHelperStatics {
      val refiid = Guid.REFIID(IKeyTimeHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.KeyTimeHelper".toHandle(),refiid,interfacePtr)
      val result = IKeyTimeHelperStatics.ABI.makeIKeyTimeHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KeyTimeHelper {
      val address = segment.toRawLongValue()
      return KeyTimeHelper(Pointer(address))
    }

    public override fun toNative(obj: KeyTimeHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromTimeSpan(timeSpan: TimeSpan) =
        ABI.IKeyTimeHelperStatics_Instance.FromTimeSpan(timeSpan)
  }
}
