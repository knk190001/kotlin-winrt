package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(ConnectedAnimationConfiguration.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.ConnectedAnimationConfiguration;{e848379d-7e25-5976-bfb3-086bac4e8849})")
@WinRTByReference(brClass = ConnectedAnimationConfiguration.ByReference::class)
public open class ConnectedAnimationConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConnectedAnimationConfiguration.WithDefault, IWinRTObject {
  private val __1521284320_Interface: IConnectedAnimationConfiguration.WithDefault by lazy {
    as_1521284320()
  }


  public override val __1521284320_Ptr: JNAPointer? by lazy {
    __1521284320_Interface.__1521284320_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1521284320_Interface)

  private fun as_1521284320(): IConnectedAnimationConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IConnectedAnimationConfiguration.ABI.makeIConnectedAnimationConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectedAnimationConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectedAnimationConfiguration.ABI.makeIConnectedAnimationConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConnectedAnimationConfiguration> {
    public override fun getValue() = ConnectedAnimationConfiguration(pointer.getPointer(0))

    public fun setValue(value: ConnectedAnimationConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConnectedAnimationConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ConnectedAnimationConfiguration {
      val address = segment.toRawLongValue()
      return ConnectedAnimationConfiguration(Pointer(address))
    }

    public override fun toNative(obj: ConnectedAnimationConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
